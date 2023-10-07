package com.demo.mapping_inheritance;

import com.demo.mapping_inheritance.repository.joined_table.JT_BookRepository;
import com.demo.mapping_inheritance.repository.joined_table.JT_CameraRepository;
import com.demo.mapping_inheritance.repository.joined_table.JT_MyProductRepository;
import com.demo.mapping_inheritance.repository.joined_table.JT_PenRepository;
import com.demo.mapping_inheritance.repository.mapped_superclass.BookRepository;
import com.demo.mapping_inheritance.repository.mapped_superclass.CameraRepository;
import com.demo.mapping_inheritance.repository.mapped_superclass.PenRepository;
import com.demo.mapping_inheritance.repository.single_table.ST_BookRepository;
import com.demo.mapping_inheritance.repository.single_table.ST_CameraRepository;
import com.demo.mapping_inheritance.repository.single_table.ST_MyProductRepository;
import com.demo.mapping_inheritance.repository.single_table.ST_PenRepository;
import com.demo.mapping_inheritance.repository.table_per_class.TPC_BookRepository;
import com.demo.mapping_inheritance.repository.table_per_class.TPC_CameraRepository;
import com.demo.mapping_inheritance.repository.table_per_class.TPC_MyProductRepository;
import com.demo.mapping_inheritance.repository.table_per_class.TPC_PenRepository;
import com.demo.mapping_inheritance.strategy.mapped_superclass.Book;
import com.demo.mapping_inheritance.strategy.mapped_superclass.Camera;
import com.demo.mapping_inheritance.strategy.mapped_superclass.InkColor;
import com.demo.mapping_inheritance.strategy.mapped_superclass.Pen;
import com.demo.mapping_inheritance.strategy.table_per_class.MyProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MappingInheritanceToDbApplicationTests {
    // Fields - MappedSuperclass strategy
    @Autowired
    private BookRepository mscBookRepo;
    @Autowired
    private PenRepository mscPenRepo;
    @Autowired
    private CameraRepository mscCameraRepo;

    // Fields - Single Table strategy
    @Autowired
    private ST_BookRepository stBookRepo;
    @Autowired
    private ST_PenRepository stPenRepo;
    @Autowired
    private ST_CameraRepository stCameraRepo;
    @Autowired
    private ST_MyProductRepository stMyProductRepo;

    // Fields - Joined Table strategy
    @Autowired
    private JT_BookRepository jtBookRepo;
    @Autowired
    private JT_PenRepository jtPenRepo;
    @Autowired
    private JT_CameraRepository jtCameraRepo;
    @Autowired
    private JT_MyProductRepository jtMyProductRepo;

    // Fields - Table Per Class strategy
    @Autowired
    private TPC_BookRepository tpcBookRepo;
    @Autowired
    private TPC_PenRepository tpcPenRepo;
    @Autowired
    private TPC_CameraRepository tpcCameraRepo;
    @Autowired
    private TPC_MyProductRepository tpcMyProductRepo;

    @Test
    void contextLoads() {
    }

    @Test
    void mappedSuperClass_createEntries() {
        Book book = new Book();
        book.setName("Becoming Developer for Dummies");
        book.setAuthor("Uncle Bob");
        mscBookRepo.save(book);

        Pen pen = new Pen();
        pen.setName("Reynolds Racer");
        pen.setInkColor(InkColor.BLUE);
        mscPenRepo.save(pen);

        Camera camera = new Camera();
        camera.setName("Sony Cybershot");
        camera.setSensor(24.1);
        mscCameraRepo.save(camera);
    }

    @Test
    void singleTable_createEntries() {
        com.demo.mapping_inheritance.strategy.single_table.Book book = new com.demo.mapping_inheritance.strategy.single_table.Book();
        book.setName("Planning for Retirement for Dummies");
        book.setAuthor("Uncle Grandpa");
        stBookRepo.save(book);

        com.demo.mapping_inheritance.strategy.single_table.Pen pen = new com.demo.mapping_inheritance.strategy.single_table.Pen();
        pen.setName("Rotomac");
        pen.setInkColor(com.demo.mapping_inheritance.strategy.single_table.InkColor.RED);
        stPenRepo.save(pen);

        com.demo.mapping_inheritance.strategy.single_table.Camera camera = new com.demo.mapping_inheritance.strategy.single_table.Camera();
        camera.setName("Canon Pixima");
        camera.setSensor(16.1);
        stCameraRepo.save(camera);

        com.demo.mapping_inheritance.strategy.single_table.MyProduct product = new com.demo.mapping_inheritance.strategy.single_table.MyProduct();
        product.setName("Death Sandwich");
        stMyProductRepo.save(product);
    }

    @Test
    void joinedTable_createEntries() {
        com.demo.mapping_inheritance.strategy.joined_table.Book book = new com.demo.mapping_inheritance.strategy.joined_table.Book();
        book.setName("How to earn money while sleeping for Dummies");
        book.setAuthor("Ganthar");
        jtBookRepo.save(book);

        com.demo.mapping_inheritance.strategy.joined_table.Pen pen = new com.demo.mapping_inheritance.strategy.joined_table.Pen();
        pen.setName("Add Gel");
        pen.setInkColor(com.demo.mapping_inheritance.strategy.joined_table.InkColor.GREEN);
        jtPenRepo.save(pen);

        com.demo.mapping_inheritance.strategy.joined_table.Camera camera = new com.demo.mapping_inheritance.strategy.joined_table.Camera();
        camera.setName("Samsung");
        camera.setSensor(21.1);
        jtCameraRepo.save(camera);

        com.demo.mapping_inheritance.strategy.joined_table.MyProduct product = new com.demo.mapping_inheritance.strategy.joined_table.MyProduct();
        product.setName("Krabby Patty");
        jtMyProductRepo.save(product);
    }

    @Test
    void tablePerClass_createEntries() {
        com.demo.mapping_inheritance.strategy.table_per_class.Book book = new com.demo.mapping_inheritance.strategy.table_per_class.Book();
        book.setName("Work from Home for Dummies");
        book.setAuthor("Patrick Star");
        tpcBookRepo.save(book);

        com.demo.mapping_inheritance.strategy.table_per_class.Pen pen = new com.demo.mapping_inheritance.strategy.table_per_class.Pen();
        pen.setName("Luxor");
        pen.setInkColor(com.demo.mapping_inheritance.strategy.table_per_class.InkColor.BLUE);
        tpcPenRepo.save(pen);

        com.demo.mapping_inheritance.strategy.table_per_class.Camera camera = new com.demo.mapping_inheritance.strategy.table_per_class.Camera();
        camera.setName("Kodak");
        camera.setSensor(50.0);
        tpcCameraRepo.save(camera);

        MyProduct product = new MyProduct();
        product.setName("Teddy Bear");
        tpcMyProductRepo.save(product);
    }
}
