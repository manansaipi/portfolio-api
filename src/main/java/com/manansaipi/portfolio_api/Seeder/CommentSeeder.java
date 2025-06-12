// package com.manansaipi.portfolio_api.Seeder;

// import com.manansaipi.portfolio_api.Models.Comment;
// import com.manansaipi.portfolio_api.Repository.CommentRepository;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// @Component
// public class CommentSeeder implements CommandLineRunner {

//     private CommentRepository commentRepository;

//     public CommentSeeder(CommentRepository commentRepository) {
//         this.commentRepository = commentRepository;
//     }

//     @Override
//     public void run(String... args) throws Exception {
//         // Check if already seeded
//         if (commentRepository.count() == 0) {
//             commentRepository.save(new Comment("hello"));
//             commentRepository.save(new Comment("world"));
//             commentRepository.save(new Comment("down"));
//             commentRepository.save(new Comment("abcd"));
//             System.out.println("✅ Seeded test comments.");
//         }
//     }
// }
