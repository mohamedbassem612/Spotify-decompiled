package p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.listrow.EncoreListRow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kvx {
    public final EncoreListRow a;
    public final idd1 b = new idd1(new v7v(this, (byte) 21));

    public kvx(EncoreListRow encoreListRow) {
        this.a = encoreListRow;
    }

    public final ConstraintLayout a() {
        return (ConstraintLayout) this.b.getValue();
    }

    public final View b() {
        return this.a.findViewById(2131429948);
    }

    public final View c() {
        return this.a.findViewById(2131431125);
    }

    public final View d() {
        return this.a.findViewById(2131431502);
    }
}
