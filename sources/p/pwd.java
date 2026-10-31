package p;

import android.content.Context;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pwd implements bhd1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public pwd(h98 h98Var, Context context) {
        this.a = (byte) 1;
        this.b = context;
    }

    public final void a(dhd1 dhd1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((RecyclerView) ((qwd) obj).b.b).y0(dhd1Var.b);
                break;
            case 1:
                TextView textViewE = h98.e(dhd1Var);
                if (textViewE != null) {
                    textViewE.setTextAppearance(2132018004);
                }
                break;
            case 2:
                ((ViewPager) obj).setCurrentItem(dhd1Var.b);
                break;
            default:
                ((ViewPager2) obj).d(dhd1Var.b, true);
                break;
        }
    }

    public final void b(dhd1 dhd1Var) {
        TextView textViewE;
        switch (this.a) {
            case 1:
                if (dhd1Var != null && (textViewE = h98.e(dhd1Var)) != null) {
                    Context context = (Context) this.b;
                    textViewE.setTextAppearance(2132018003);
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(2130968791, typedValue, true);
                    textViewE.setTextColor(context.getColor(typedValue.resourceId));
                    break;
                }
                break;
        }
    }

    public final void c(dhd1 dhd1Var) {
        byte b = this.a;
    }

    public /* synthetic */ pwd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void d(dhd1 dhd1Var) {
    }

    private final void e(dhd1 dhd1Var) {
    }

    private final void f(dhd1 dhd1Var) {
    }

    private final void g(dhd1 dhd1Var) {
    }

    private final void h(dhd1 dhd1Var) {
    }

    private final void i(dhd1 dhd1Var) {
    }

    private final void j(dhd1 dhd1Var) {
    }
}
