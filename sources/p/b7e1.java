package p;

import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class b7e1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wat b;
    public final /* synthetic */ ven0 c;

    public /* synthetic */ b7e1(wat watVar, ven0 ven0Var, byte b) {
        this.a = b;
        this.b = watVar;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        wat watVar = this.b;
        switch (b) {
            case 0:
                s3v s3vVar = (s3v) obj;
                ven0Var.setValue(new yr80((((long) watVar.i0(s3v.a(s3vVar.a))) & 4294967295L) | (((long) watVar.i0(s3v.b(s3vVar.a))) << 32)));
                return rih1.a;
            default:
                ki5 ki5Var = new ki5((Function0) obj, (byte) 9);
                b7e1 b7e1Var = new b7e1(watVar, ven0Var, (byte) 0);
                if (rxf0.a()) {
                    return rxf0.a() ? new oxf0(ki5Var, b7e1Var, Build.VERSION.SDK_INT == 28 ? ykb0.b : zct0.b) : nim0.a;
                }
                hhg1.h("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }
}
