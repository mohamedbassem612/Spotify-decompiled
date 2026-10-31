package p;

import android.content.Context;
import android.view.View;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kis implements qzh {
    public final /* synthetic */ byte a;
    public final Context b;
    public final af10 c;
    public final idd1 d;

    public kis(Context context, af10 af10Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = context;
                this.c = af10Var;
                this.d = new idd1(new dor(this, (byte) 24));
                break;
            case 2:
                this.b = context;
                this.c = af10Var;
                this.d = new idd1(new dor(this, (byte) 25));
                break;
            default:
                this.b = context;
                this.c = af10Var;
                this.d = new idd1(new dor(this, (byte) 23));
                break;
        }
    }

    public uxw0 a() {
        return (uxw0) this.d.getValue();
    }

    public szw0 b() {
        return (szw0) this.d.getValue();
    }

    public c0x0 e() {
        return (c0x0) this.d.getValue();
    }

    public final void f(Object obj) {
        byte b = this.a;
        Context context = this.b;
        af10 af10Var = this.c;
        switch (b) {
            case 0:
                txw0 txw0Var = (txw0) obj;
                EncoreTextView encoreTextView = a().c;
                String str = txw0Var.b;
                encoreTextView.setText(str);
                a().d.e(af10Var, new td10(txw0Var.c, txw0Var.a, str, (sd10) null));
                if (!txw0Var.d) {
                    a().g.setText(context.getString(2131960464));
                    a().b.setText(context.getString(2131960462));
                    a().e.setText(context.getString(2131960451));
                    a().f.setText(context.getString(2131960458));
                } else {
                    a().g.setText(context.getString(2131963949));
                    a().b.setText(context.getString(2131963948));
                    a().e.setText(context.getString(2131963939));
                    a().f.setText(context.getString(2131963944));
                }
                break;
            case 1:
                rzw0 rzw0Var = (rzw0) obj;
                EncoreTextView encoreTextView2 = b().c;
                String str2 = rzw0Var.b;
                encoreTextView2.setText(str2);
                b().d.e(af10Var, new td10(rzw0Var.c, rzw0Var.a, str2, (sd10) null));
                if (!rzw0Var.d) {
                    b().g.setText(context.getString(2131960466));
                    b().b.setText(context.getString(2131960465));
                    b().e.setText(context.getString(2131960459));
                    b().f.setText(context.getString(2131960455));
                } else {
                    b().g.setText(context.getString(2131963951));
                    b().b.setText(context.getString(2131963950));
                    b().e.setText(context.getString(2131960459));
                    b().f.setText(context.getString(2131963942));
                }
                break;
            default:
                a0x0 a0x0Var = (a0x0) obj;
                boolean z = a0x0Var.e;
                FaceView faceView = e().e;
                String str3 = a0x0Var.c;
                String str4 = a0x0Var.a;
                String str5 = a0x0Var.b;
                faceView.e(af10Var, new td10(str3, str4, str5, (sd10) null));
                e().c.setText(str5);
                EncoreProgressIndicatorButton encoreProgressIndicatorButton = e().f;
                boolean z2 = a0x0Var.d;
                encoreProgressIndicatorButton.setEnabled(!z2);
                e().f.setShowProgressIndicator(z2);
                e().f.setText(context.getString(z2 ? 2131960457 : z ? 2131963943 : 2131960456));
                if (!z) {
                    e().g.setText(context.getString(2131960469));
                    e().b.setText(context.getString(2131960468));
                    e().d.setText(context.getString(2131960454));
                } else {
                    e().g.setText(context.getString(2131963953));
                    e().b.setText(context.getString(2131963952));
                    e().d.setText(context.getString(2131963941));
                }
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return a().a;
            case 1:
                return b().a;
            default:
                return e().a;
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                a().d.setOnClickListener(new oes(iu30Var, (byte) 21));
                a().e.setOnClickListener(new oes(iu30Var, (byte) 22));
                a().f.setOnClickListener(new oes(iu30Var, (byte) 23));
                break;
            case 1:
                b().e.setOnClickListener(new oes(iu30Var, (byte) 24));
                b().f.setOnClickListener(new oes(iu30Var, (byte) 25));
                break;
            default:
                e().d.setOnClickListener(new oes(iu30Var, (byte) 26));
                e().f.setOnClickListener(new oes(iu30Var, (byte) 27));
                break;
        }
    }
}
