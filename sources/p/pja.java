package p;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pja extends z511 {
    public List d;
    public boolean e;
    public m0o f;

    public final int e() {
        return this.d.size();
    }

    public final void n(int i, w611 w611Var) {
        j4b1 j4b1VarValueOf;
        nja njaVar = (nja) w611Var;
        ConstraintLayout constraintLayout = njaVar.W0;
        SpotifyIconView spotifyIconView = njaVar.U0;
        try {
            j4b1VarValueOf = j4b1.valueOf(((hja) this.d.get(i)).a.toUpperCase(Locale.ROOT));
        } catch (Throwable unused) {
            j4b1VarValueOf = j4b1.t5;
        }
        spotifyIconView.setIcon(j4b1VarValueOf);
        njaVar.V0.setText(((hja) this.d.get(i)).b);
        constraintLayout.setOnClickListener(new oja(this, i, (byte) 0));
        if (((hja) this.d.get(i)).d.length() > 0) {
            spotifyIconView.setColor(Color.parseColor(((hja) this.d.get(i)).d));
        }
        if (((hja) this.d.get(i)).e) {
            constraintLayout.setBackgroundColor(constraintLayout.getContext().getColor(2131100226));
        }
        int length = ((hja) this.d.get(i)).c.length();
        TextView textView = njaVar.X0;
        if (length > 0) {
            textView.setText(((hja) this.d.get(i)).c);
        } else {
            textView.setVisibility(8);
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        View viewL = eqq.l(viewGroup, this.e ? 2131624084 : 2131624083, viewGroup, false);
        viewL.getClass();
        return new nja(viewL);
    }
}
