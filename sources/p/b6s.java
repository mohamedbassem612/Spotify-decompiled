package p;

import android.content.Context;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.live.LiveEventBadgeView;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b6s implements qzh {
    public final /* synthetic */ byte a;
    public final View b;
    public final TextView c;
    public final View d;

    public b6s(Context context, byte b) {
        View viewInflate;
        this.a = b;
        switch (b) {
            case 1:
                Trace.beginSection("ECM:SectionHeading2:inflate");
                try {
                    if (((Boolean) ycn0.e.getValue()).booleanValue()) {
                        viewInflate = sgc1.B(context);
                    } else {
                        viewInflate = LayoutInflater.from(context).inflate(2131626110, (ViewGroup) null);
                        viewInflate.getClass();
                    }
                    Trace.endSection();
                    this.b = viewInflate;
                    TextView textView = (TextView) b8k1.n(viewInflate, 2131430882);
                    this.c = textView;
                    this.d = (TextView) b8k1.n(viewInflate, 2131430881);
                    viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166957);
                    viewInflate.setPadding(dimensionPixelSize, viewInflate.getPaddingTop(), dimensionPixelSize, viewInflate.getPaddingBottom());
                    b8k1.p(textView, zxe1.a);
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(2131625153, (ViewGroup) null);
                this.b = viewInflate2;
                this.d = (LiveEventBadgeView) viewInflate2.findViewById(2131429808);
                this.c = (TextView) viewInflate2.findViewById(2131428543);
                return;
        }
    }

    public final void f(Object obj) {
        byte b = this.a;
        TextView textView = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                qpd0 qpd0Var = (qpd0) obj;
                ((LiveEventBadgeView) obj2).f(new nnd0(qpd0Var.b));
                textView.setText(n1p1.l(qpd0Var.a, new Locale(upn1.o(textView.getContext(), "_"))));
                break;
            default:
                textView.setText(((kh51) obj).a);
                ((TextView) obj2).setVisibility(8);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }
}
