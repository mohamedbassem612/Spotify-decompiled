package p;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class if21 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rpv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if21(rpv0 rpv0Var, byte b) {
        super(1);
        this.a = b;
        this.b = rpv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0064  */
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        rpv0 rpv0Var = this.b;
        switch (b) {
            case 0:
                jnq jnqVar = (jnq) rpv0Var.b;
                long millis = timeUnit.toMillis(((i1z) obj).y);
                Calendar calendarD = ((yqg) jnqVar.c).d();
                calendarD.setTimeInMillis(millis);
                return Boolean.valueOf(jnq.d((Calendar) jnqVar.a, calendarD));
            case 1:
                long millis2 = timeUnit.toMillis(((i1z) obj).y);
                jnq jnqVar2 = (jnq) rpv0Var.b;
                yqg yqgVar = (yqg) jnqVar2.c;
                Calendar calendarD2 = yqgVar.d();
                calendarD2.setTimeInMillis(millis2);
                if (jnq.d((Calendar) jnqVar2.a, calendarD2)) {
                    z = true;
                } else {
                    Calendar calendarD3 = yqgVar.d();
                    calendarD3.setTimeInMillis(millis2);
                    if (jnq.d((Calendar) jnqVar2.b, calendarD3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            default:
                jnq jnqVar3 = (jnq) rpv0Var.b;
                long millis3 = timeUnit.toMillis(((i1z) obj).y);
                Calendar calendarD4 = ((yqg) jnqVar3.c).d();
                calendarD4.setTimeInMillis(millis3);
                return Boolean.valueOf(calendarD4.after((Calendar) jnqVar3.d));
        }
    }
}
