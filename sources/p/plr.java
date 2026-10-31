package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.endless.uiusecases.changesegmentbutton.ChangeSegmentButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class plr implements ChangeSegmentButton {
    public final EncoreButton a;
    public final View b;
    public final r4u c;

    public plr(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131624576, (ViewGroup) null);
        this.b = viewInflate;
        this.a = viewInflate.findViewById(2131427839);
        this.c = r4u.c(new r4u[]{r4u.d(new qlr(klr.b, (byte) 0), r4u.a(new her(this, (byte) 1))), r4u.d(new qlr(llr.b, (byte) 0), r4u.a(new rjn(this, (byte) 9))), r4u.d(new qlr(mlr.b, (byte) 0), r4u.a(new vun(this, (byte) 7))), r4u.d(new qlr(nlr.b, (byte) 0), r4u.a(new zwa(this, (byte) 29))), r4u.d(new qlr(olr.b, (byte) 0), r4u.a(new h9n(this, (byte) 7))), r4u.d(new qlr(jlr.b, (byte) 0), r4u.a(new sun(this, (byte) 5)))});
    }

    public static ColorStateList a(int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{uah.d(i, -16777216, 0.3f), i});
    }

    public final void f(Object obj) {
        this.c.e((yee) obj);
    }

    public final View getView() {
        return this.b;
    }

    public final void n(iu30 iu30Var) {
        View.OnClickListener yerVar = new yer(iu30Var, (byte) 22);
        EncoreButton encoreButton = this.a;
        encoreButton.setOnClickListener(yerVar);
        encoreButton.setOnLongClickListener(new wer(iu30Var, (byte) 1));
    }
}
