package p;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class awa implements f4h1 {
    public final /* synthetic */ byte a;
    public final View b;
    public final Object c;
    public final Object d;

    public awa(LinearLayout linearLayout, ewa ewaVar, tva tvaVar, Bundle bundle) {
        this.a = (byte) 0;
        this.b = linearLayout;
        this.c = ewaVar;
        this.d = tvaVar;
        ewaVar.c(bundle);
    }

    public final Object getView() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                return (LinearLayout) view;
            case 1:
                return view;
            case 2:
                return (LinearLayout) view;
            default:
                return view;
        }
    }

    public final Bundle serialize() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((ewa) obj).d(bundle);
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((tm30) this.d).b(bundle2);
                return bundle2;
            case 2:
                return ((q8e0) obj).d();
            default:
                return mno1.g();
        }
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((ewa) obj2).e((tva) obj);
                break;
            case 1:
                ((sp00) obj2).w();
                break;
            case 2:
                q8e0 q8e0Var = (q8e0) obj2;
                q8e0Var.b.d = q8e0Var;
                q8e0Var.e((o9v0) obj);
                break;
            default:
                hhf1 hhf1Var = (hhf1) obj2;
                hhf1Var.start();
                hhf1Var.d.subscribe(new z2a1(this, (byte) 17));
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((ewa) obj).f();
                break;
            case 1:
                ((sp00) obj).v();
                break;
            case 2:
                ((q8e0) obj).e.g();
                break;
        }
    }

    public /* synthetic */ awa(View view, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    private final void b() {
    }
}
