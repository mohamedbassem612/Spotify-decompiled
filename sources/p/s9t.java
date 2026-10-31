package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s9t implements Iterator, ola0 {
    public int a = -1;
    public int b;
    public int c;
    public tr80 d;
    public int e;
    public final /* synthetic */ t9t f;

    public s9t(t9t t9tVar) {
        this.f = t9tVar;
        int iP = yoi1.p(0, 0, t9tVar.a.length());
        this.b = iP;
        this.c = iP;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    public final void a() {
        mmr0 mmr0Var;
        t9t t9tVar = this.f;
        CharSequence charSequence = t9tVar.a;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        int i2 = t9tVar.b;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
            if (i3 >= i2) {
                this.d = new tr80(this.b, ihc1.q0(charSequence), 1);
                this.c = -1;
            } else if (i > charSequence.length() && (mmr0Var = (mmr0) t9tVar.c.invoke(charSequence, Integer.valueOf(this.c))) != null) {
                int iIntValue = ((Number) mmr0Var.a).intValue();
                int iIntValue2 = ((Number) mmr0Var.b).intValue();
                this.d = yoi1.Q(this.b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.b = i4;
                this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.d = new tr80(this.b, ihc1.q0(charSequence), 1);
                this.c = -1;
            }
        } else if (i > charSequence.length()) {
            this.d = new tr80(this.b, ihc1.q0(charSequence), 1);
            this.c = -1;
        } else {
            int iIntValue3 = ((Number) mmr0Var.a).intValue();
            int iIntValue4 = ((Number) mmr0Var.b).intValue();
            this.d = yoi1.Q(this.b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.b = i5;
            this.c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            hhg1.k();
            return null;
        }
        tr80 tr80Var = this.d;
        this.d = null;
        this.a = -1;
        return tr80Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
