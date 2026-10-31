package p;

import android.os.StatFs;
import com.ravelin.core.model.SharedPackages;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mf41 implements Function0 {
    public final /* synthetic */ byte a;

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return new ox61();
            case 2:
                SharedPackages.CoM4 coM4 = SharedPackages.Companion;
                return new r36(chc1.a, (byte) 0);
            case 3:
                return new r36(wr80.a, (byte) 0);
            case 4:
                return new p3v(0.0f);
            case 5:
            case 6:
                return null;
            case 7:
                return lee1.d;
            case 8:
                return q2h1.a;
            case 9:
                return new qr80(0L);
            case 10:
                return new qr80(0L);
            case 11:
                return Boolean.TRUE;
            case 12:
                return new m2h1();
            case 13:
                gka0 gka0Var = i520.a;
                s8s0 s8s0VarE = i520.b.e("coil3_disk_cache");
                long jR = 10485760;
                try {
                    File file = s8s0VarE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jR = yoi1.r((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new mf01(jR, gka0Var, s8s0VarE);
            case 14:
                return rih1.a;
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }
}
