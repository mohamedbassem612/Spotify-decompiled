package androidx.car.app.model;

import java.util.Objects;
import p.f2q0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ParkedOnlyOnClickListener implements f2q0 {
    private final f2q0 mListener;

    private ParkedOnlyOnClickListener(f2q0 f2q0Var) {
        this.mListener = f2q0Var;
    }

    public static ParkedOnlyOnClickListener create(f2q0 f2q0Var) {
        Objects.requireNonNull(f2q0Var);
        return new ParkedOnlyOnClickListener(f2q0Var);
    }

    @Override // p.f2q0
    public void onClick() {
        this.mListener.onClick();
    }
}
