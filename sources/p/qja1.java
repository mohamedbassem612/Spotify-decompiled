package p;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qja1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sja1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qja1(sja1 sja1Var, byte b) {
        super(0);
        this.a = b;
        this.b = sja1Var;
    }

    public final Object invoke() {
        zrc m231Var;
        byte b = this.a;
        sja1 sja1Var = this.b;
        switch (b) {
            case 0:
                File file = new File(sja1Var.a.getCacheDir(), "music-quiz-sound-effects");
                file.mkdirs();
                return file;
            default:
                znb0 znb0Var = sja1Var.h;
                try {
                    m231Var = new File((File) znb0Var.getValue(), "metadata.json").exists() ? (zrc) sja1Var.d.a(y520.H(new File((File) znb0Var.getValue(), "metadata.json")), zrc.Companion.serializer()) : new zrc();
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (e331.a(m231Var) != null) {
                    File[] fileArrListFiles = ((File) znb0Var.getValue()).listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            file2.delete();
                        }
                    }
                    m231Var = new zrc();
                }
                return m231Var;
        }
    }
}
