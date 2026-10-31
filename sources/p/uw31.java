package p;

import android.R;
import android.widget.ImageView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uw31 extends vw31 implements gy31 {
    public final ImageView d;

    public uw31(s7s0 s7s0Var) {
        super(s7s0Var);
        ImageView imageView = (ImageView) s7s0Var.findViewById(R.id.icon);
        this.d = imageView;
        v9w0 v9w0VarQ = b2u.q(s7s0Var.findViewById(2131430720));
        Collections.addAll(v9w0VarQ.c, this.c);
        Collections.addAll(v9w0VarQ.d, imageView);
        v9w0VarQ.a();
    }

    @Override // p.gy31
    public final ImageView getImageView() {
        return this.d;
    }
}
