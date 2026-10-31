package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj0(Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 1:
                function0.invoke();
                return rih1Var;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    function0.invoke();
                }
                return rih1Var;
            case 3:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 4:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 5:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 6:
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 7:
                if (((wz20) obj).b()) {
                    function0.invoke();
                }
                return rih1Var;
            case 8:
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 9:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 10:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 11:
                function0.invoke();
                return rih1Var;
            case 12:
                function0.invoke();
                return rih1Var;
            case 13:
                if (((wz20) obj).b()) {
                    function0.invoke();
                }
                return rih1Var;
            case 14:
                function0.invoke();
                return rih1Var;
            case 15:
                b261.g((e261) obj, (String) null, new ukf(function0, (byte) 8));
                return rih1Var;
            case 16:
                long j = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 17:
                long j2 = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 18:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 19:
                long j3 = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 20:
                if (!((s7x) obj).equals(s7x.a)) {
                    eg.o();
                    return null;
                }
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 21:
                if (uqh.a[((fk51) obj).ordinal()] == 1) {
                    function0.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                return new qr80(((long) ((int) Math.ceil(((Number) function0.invoke()).floatValue()))) & 4294967295L);
            case 23:
                function0.invoke();
                return rih1Var;
            case 24:
                function0.invoke();
                return rih1Var;
            case 25:
                function0.invoke();
                return rih1Var;
            case 26:
                function0.invoke();
                return rih1Var;
            case 27:
                function0.invoke();
                return rih1Var;
            case 28:
                function0.invoke();
                return rih1Var;
            default:
                function0.invoke();
                return rih1Var;
        }
    }
}
