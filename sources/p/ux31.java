package p;

import android.R;
import android.widget.ImageView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class ux31 extends vx31 implements tx31 {
    public final ImageView e;

    public ux31(s7s0 s7s0Var) {
        super(s7s0Var);
        ImageView imageView = (ImageView) s7s0Var.findViewById(R.id.icon);
        this.e = imageView;
        v9w0 v9w0VarQ = b2u.q(s7s0Var.findViewById(2131430720));
        Collections.addAll(v9w0VarQ.c, this.c, this.d);
        Collections.addAll(v9w0VarQ.d, imageView);
        v9w0VarQ.a();
    }

    @Override // p.gy31
    public final ImageView getImageView() {
        return this.e;
    }
}
