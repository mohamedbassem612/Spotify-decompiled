package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s7e0 implements f4h1, ihr0 {
    public final ges a;

    public s7e0(ges gesVar) {
        this.a = gesVar;
    }

    @Override // p.ihr0
    public final boolean b(ehr0 ehr0Var) {
        l5r0 currentPageElement = this.a.getCurrentPageElement();
        ihr0 ihr0Var = currentPageElement instanceof ihr0 ? (ihr0) currentPageElement : null;
        if (ihr0Var != null) {
            return ihr0Var.b(ehr0Var);
        }
        return false;
    }

    @Override // p.f4h1
    public final Object getView() {
        return this.a;
    }

    @Override // p.f4h1
    public final Bundle serialize() {
        return null;
    }

    @Override // p.f4h1
    public final void start() {
    }

    @Override // p.f4h1
    public final void stop() {
    }
}
