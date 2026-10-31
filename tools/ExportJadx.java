import jadx.api.JadxArgs;
import jadx.api.JadxDecompiler;
import java.io.File;
import java.util.List;
public class ExportJadx {
 public static void main(String[] args) throws Exception {
  JadxArgs opts = new JadxArgs();
  opts.setInputFiles(List.of(new File(args[0])));
  opts.setOutDir(new File(args[1]));
  opts.setThreadsCount(1);
  try (JadxDecompiler jadx = new JadxDecompiler(opts)) {
   jadx.load();
   System.out.println("Loaded classes: " + jadx.getClasses().size());
   jadx.save();
   System.out.println("Errors: " + jadx.getErrorsCount());
   System.out.println("Warnings: " + jadx.getWarnsCount());
  }
 }
}
