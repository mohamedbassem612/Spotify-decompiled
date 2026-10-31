package p;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ya4 implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ya4(byte b) {
        this.a = b;
    }

    public final Object invoke() {
        Choreographer choreographer;
        Choreographer choreographer2;
        switch (this.a) {
            case 0:
                AndroidCompositionLocals_androidKt.a("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.a("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.a("LocalView");
                throw null;
            case 5:
                if (yon1.s()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    fns fnsVar = igu.a;
                    choreographer = (Choreographer) c921.B(pyf0.a, new s55((byte) 0));
                }
                choreographer.getClass();
                v55 v55Var = new v55(choreographer, zno1.g(Looper.getMainLooper()));
                return ilo1.B(v55Var, v55Var.Y);
            case 6:
                if (cpn1.j()) {
                    choreographer2 = Choreographer.getInstance();
                } else {
                    fns fnsVar2 = igu.a;
                    choreographer2 = (Choreographer) c921.B(pyf0.a, new s55((byte) 1));
                }
                w55 w55Var = new w55(choreographer2, zno1.g(Looper.getMainLooper()));
                return ilo1.B(w55Var, w55Var.Y);
            case 7:
                return null;
            case 8:
                return eah.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 9:
                return Boolean.TRUE;
            case 10:
                return new hmb0(2);
            case 11:
                return null;
            case 12:
                t4k.b("LocalUriHandler");
                throw null;
            case 13:
                return null;
            case 14:
                t4k.b("LocalViewConfiguration");
                throw null;
            case 15:
                t4k.b("LocalWindowInfo");
                throw null;
            case 16:
                return new o4k();
            case 17:
                return null;
            case 18:
                return Boolean.FALSE;
            case 19:
                t4k.b("LocalAutofillTree");
                throw null;
            case 20:
                t4k.b("LocalAutofillManager");
                throw null;
            case 21:
                t4k.b("LocalClipboardManager");
                throw null;
            case 22:
                t4k.b("LocalFontFamilyResolver");
                throw null;
            case 23:
                t4k.b("LocalClipboard");
                throw null;
            case 24:
                t4k.b("LocalGraphicsContext");
                throw null;
            case 25:
                t4k.b("LocalDensity");
                throw null;
            case 26:
                t4k.b("LocalFocusManager");
                throw null;
            case 27:
                t4k.b("LocalFontLoader");
                throw null;
            case 28:
                t4k.b("LocalHapticFeedback");
                throw null;
            default:
                t4k.b("LocalInputManager");
                throw null;
        }
    }
}
