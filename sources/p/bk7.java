package p;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.facepile.FaceView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bk7 extends z511 {
    public final /* synthetic */ byte d;
    public Object e;
    public Object f;

    public /* synthetic */ bk7(Object obj, Object obj2, byte b) {
        this.d = b;
        this.e = obj;
        this.f = obj2;
    }

    public Object A(int i) {
        ArrayList arrayList = (ArrayList) ((c21) this.e).f;
        if (i < arrayList.size()) {
            return arrayList.get(i);
        }
        return null;
    }

    public int d(z511 z511Var, w611 w611Var, int i) {
        switch (this.d) {
            case 0:
                return z511Var.d(z511Var, w611Var, i);
            default:
                return super.d(z511Var, w611Var, i);
        }
    }

    public final int e() {
        switch (this.d) {
            case 0:
                return ((z511) this.f).e();
            case 1:
                return ((ArrayList) ((c21) this.e).f).size();
            case 2:
                return 2;
            case 3:
                return ((ArrayList) this.e).size();
            default:
                return ((List) this.e).size();
        }
    }

    public boolean equals(Object obj) {
        switch (this.d) {
            case 0:
                return ((z511) this.f).equals(obj);
            default:
                return super/*java.lang.Object*/.equals(obj);
        }
    }

    public long f(int i) {
        switch (this.d) {
            case 0:
                return ((z511) this.f).f(i);
            default:
                return super.f(i);
        }
    }

    public int g(int i) {
        switch (this.d) {
            case 0:
                return ((z511) this.f).g(i);
            case 1:
                return ((c21) this.e).p(i);
            default:
                return super.g(i);
        }
    }

    public int hashCode() {
        switch (this.d) {
            case 0:
                return ((z511) this.f).hashCode();
            default:
                return super/*java.lang.Object*/.hashCode();
        }
    }

    public void m(RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                ((h6t) this.e).a(recyclerView);
                ((z511) this.f).m(recyclerView);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.widget.TextView, p.e5g] */
    public final void n(int i, w611 w611Var) {
        String str;
        Drawable drawable;
        Drawable drawable2 = null;
        switch (this.d) {
            case 0:
                ((z511) this.f).n(i, w611Var);
                break;
            case 1:
                ((c21) this.e).g((u1i) w611Var, i, (Object) null);
                break;
            case 2:
                zug0 zug0Var = (zug0) w611Var;
                TextView textView = zug0Var.V0;
                p1f0 p1f0Var = zug0Var.U0;
                if (i == 0) {
                    str = (String) p1f0Var.f;
                } else if (i != 1) {
                    p1f0Var.getClass();
                    hhg1.n("Unsupported view type");
                } else {
                    str = (String) p1f0Var.g;
                }
                textView.setText(str);
                ImageView imageView = zug0Var.W0;
                dg30 dg30Var = (dg30) ((WeakReference) p1f0Var.h).get();
                if (dg30Var != null && (drawable = dg30Var.getDrawable(2131231483)) != null) {
                    drawable.setTint(-1);
                    drawable2 = drawable;
                }
                imageView.setImageDrawable(drawable2);
                ((w611) zug0Var).a.setOnClickListener(new oja(zug0Var, i, (byte) 1));
                break;
            case 3:
                kni0 kni0Var = (kni0) w611Var;
                ArrayList arrayList = (ArrayList) this.e;
                hji0 hji0Var = (hji0) arrayList.get(i);
                FaceView faceView = kni0Var.V0;
                gw70 gw70Var = (gw70) this.f;
                td10 td10Var = new td10(hji0Var.b, hji0Var.a, null, null);
                int i2 = FaceView.f;
                faceView.g(gw70Var, td10Var, null);
                boolean z = hji0Var.d;
                TextView textView2 = kni0Var.W0;
                if (z) {
                    textView2.setText(kni0Var.U0.getString(2131960333));
                    kni0Var.Y0.setVisibility(0);
                } else {
                    textView2.setText(((hji0) arrayList.get(i)).a);
                }
                kni0Var.X0.setText(((hji0) arrayList.get(i)).g);
                break;
            default:
                mdy0 mdy0Var = (mdy0) w611Var;
                String str2 = (String) ((List) this.e).get(i);
                ?? r0 = mdy0Var.U0;
                r0.n(new gu2(mdy0Var.V0, str2, i, (byte) 27));
                r0.setText(str2);
                break;
        }
    }

    public void o(w611 w611Var, int i, List list) {
        switch (this.d) {
            case 0:
                ((z511) this.f).o(w611Var, i, list);
                break;
            default:
                super.o(w611Var, i, list);
                break;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        switch (this.d) {
            case 0:
                return ((z511) this.f).p(i, viewGroup);
            case 1:
                return ((c21) this.e).j(i, viewGroup, (bkl) this.f);
            case 2:
                return new zug0(((LayoutInflater) this.e).inflate(2131625348, viewGroup, false), (p1f0) this.f);
            case 3:
                View viewL = eqq.l(viewGroup, 2131625389, viewGroup, false);
                viewL.getClass();
                return new kni0(viewL);
            default:
                return new mdy0(this, new e5g(viewGroup.getContext(), (byte) 0));
        }
    }

    public void r(RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                ((z511) this.f).r(recyclerView);
                ((h6t) this.e).a((View) null);
                break;
        }
    }

    public boolean s(w611 w611Var) {
        switch (this.d) {
            case 0:
                return ((z511) this.f).s(w611Var);
            default:
                return super.s(w611Var);
        }
    }

    public void t(w611 w611Var) {
        switch (this.d) {
            case 0:
                ((z511) this.f).t(w611Var);
                break;
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return ((z511) this.f).toString();
            default:
                return super/*java.lang.Object*/.toString();
        }
    }

    public void u(w611 w611Var) {
        switch (this.d) {
            case 0:
                ((z511) this.f).u(w611Var);
                break;
        }
    }

    public void v(w611 w611Var) {
        switch (this.d) {
            case 0:
                ((z511) this.f).v(w611Var);
                break;
        }
    }

    public void w(b611 b611Var) {
        switch (this.d) {
            case 0:
                ((z511) this.f).w(b611Var);
                break;
            default:
                super.w(b611Var);
                break;
        }
    }

    public void z(b611 b611Var) {
        switch (this.d) {
            case 0:
                ((z511) this.f).z(b611Var);
                break;
            default:
                super.z(b611Var);
                break;
        }
    }
}
