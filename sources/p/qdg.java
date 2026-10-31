package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qdg implements f4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;

    public qdg(Context context, lzn0 lzn0Var, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = context;
                this.b = lzn0Var;
                break;
            default:
                this.c = context;
                this.b = lzn0Var;
                ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setContent(new j2i(-1847022852, new i4o(this, (byte) 26), true));
                this.d = composeView;
                break;
        }
    }

    public static final /* synthetic */ tdl0 b(qdg qdgVar) {
        return (tdl0) qdgVar.c;
    }

    public final Object getView() {
        switch (this.a) {
            case 0:
                return (View) this.d;
            case 1:
                return (ComposeView) this.d;
            case 2:
                return (ViewGroup) this.d;
            default:
                return new FrameLayout((Context) this.c);
        }
    }

    public final void start() {
        switch (this.a) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new s10(this, (byte) 21));
                break;
            case 1:
                break;
            case 2:
                ((u4p0) this.b).start();
                break;
            default:
                Context context = (Context) this.c;
                mw40 mw40VarT = yoi1.T(context, context.getString(2131960558), context.getString(2131960557));
                mw40VarT.e = false;
                String string = context.getString(2131959373);
                oad oadVar = new oad(this, (byte) 26);
                mw40VarT.a = string;
                mw40VarT.c = oadVar;
                pw40 pw40VarB = mw40VarT.b();
                pw40VarB.b();
                this.d = pw40VarB;
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ((u4p0) this.b).stop();
                break;
            default:
                pw40 pw40Var = (pw40) this.d;
                if (pw40Var != null) {
                    pw40Var.a();
                }
                break;
        }
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    public qdg(lzn0 lzn0Var, Context context, cdg cdgVar) {
        this.a = (byte) 0;
        this.b = lzn0Var;
        this.c = cdgVar;
        View view = new View(context);
        view.setId(2131430620);
        this.d = view;
    }

    public qdg(u4p0 u4p0Var, Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = (byte) 2;
        this.b = u4p0Var;
        this.c = new tdl0((byte) 13);
        u4p0Var.c(context, layoutInflater, viewGroup);
        ViewGroup view = u4p0Var.getView();
        view.getClass();
        j7p1.y(viewGroup, new u6j0(this, (byte) 8));
        this.d = view;
    }
}
