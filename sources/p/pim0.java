package p;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class pim0 implements x4t {
    public boolean N0;
    public boolean X;
    public boolean Y;
    public og Z;
    public llm b;
    public int c;
    public pim0 e;
    public pim0 f;
    public tjp0 g;
    public ndo0 h;
    public boolean i;
    public boolean t;
    public pim0 a = this;
    public int d = -1;

    public void C1() {
        if (!this.N0) {
            qf80.c("reset() called on an unattached node");
        }
        B1();
    }

    public void D1() {
        if (!this.N0) {
            qf80.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.X) {
            qf80.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.X = false;
        z1();
        this.Y = true;
    }

    public void E1() {
        if (!this.N0) {
            qf80.c("node detached multiple times");
        }
        if (this.h == null) {
            qf80.c("detach invoked on a node without a coordinator");
        }
        if (!this.Y) {
            qf80.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.Y = false;
        og ogVar = this.Z;
        if (ogVar != null) {
            ogVar.invoke();
        }
        A1();
    }

    public void F1(pim0 pim0Var) {
        this.a = pim0Var;
    }

    public void G1(ndo0 ndo0Var) {
        this.h = ndo0Var;
    }

    public final c9n v1() {
        llm llmVar = this.b;
        if (llmVar != null) {
            return llmVar;
        }
        llm llmVarE = smo1.e(((ha4) oap1.C(this)).getCoroutineContext().y(op71.e(((ha4) oap1.C(this)).getCoroutineContext().A(fkj0.W0))));
        this.b = llmVarE;
        return llmVarE;
    }

    public boolean w1() {
        return !(this instanceof ky9);
    }

    public void x1() {
        if (this.N0) {
            qf80.c("node attached multiple times");
        }
        if (this.h == null) {
            qf80.c("attach invoked on a node without a coordinator");
        }
        this.N0 = true;
        this.X = true;
    }

    public void y1() {
        if (!this.N0) {
            qf80.c("Cannot detach a node that is not attached");
        }
        if (this.X) {
            qf80.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.Y) {
            qf80.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.N0 = false;
        llm llmVar = this.b;
        if (llmVar != null) {
            smo1.p(llmVar, new ModifierNodeDetachedCancellationException());
            this.b = null;
        }
    }

    public void A1() {
    }

    public void B1() {
    }

    public void z1() {
    }
}
