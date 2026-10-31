package p;

import android.content.ContentResolver;
import android.view.accessibility.AccessibilityManager;
import com.spotify.mobius.Connection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sj4 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sj4(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                th30 th30Var = (th30) obj4;
                zf30 zf30Var = (zf30) obj3;
                ((pi30) obj2).a.setValue(th30Var.f0(zf30Var));
                if (((l811) obj).a) {
                    nu9 nu9Var = new nu9(th30Var);
                    nu9Var.m(zf30Var);
                    nu9Var.i();
                } else if (!th30Var.U()) {
                    nu9 nu9Var2 = new nu9(th30Var);
                    nu9Var2.m(zf30Var);
                    nu9Var2.h();
                }
                break;
            case 1:
                Connection connection = (Connection) ((ven0) obj4).getValue();
                if (connection != null) {
                    connection.dispose();
                }
                ((ven0) obj3).setValue((Object) null);
                ((xmh) obj2).R0 = null;
                ((ven0) obj).setValue((Object) null);
                break;
            case 2:
                ven0 ven0Var = (ven0) obj3;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    o5v o5vVar = (o5v) ((ven0) obj2).getValue();
                    if (o5vVar != null) {
                        fn31.T((c9n) obj, null, 0, new g6v(o5vVar, null, (byte) 0), 3);
                    }
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        ((Function0) obj4).invoke();
                    }
                    ven0Var.setValue(Boolean.FALSE);
                }
                break;
            case 3:
                mvh1 mvh1Var = (mvh1) ((ven0) obj4).getValue();
                if (!((Boolean) ((ven0) obj3).getValue()).booleanValue() && !u890.j(mvh1Var, ((evh1) obj2).a)) {
                    ((iu30) ((ven0) obj).getValue()).invoke(mvh1Var);
                    break;
                }
                break;
            default:
                ((ContentResolver) obj4).unregisterContentObserver((p2a) obj3);
                ((AccessibilityManager) obj2).removeTouchExplorationStateChangeListener((zg) obj);
                break;
        }
    }
}
