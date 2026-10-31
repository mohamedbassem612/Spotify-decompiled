package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/klb0;", "Lp/uim0;", "Lp/llb0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class klb0 extends uim0 {
    public final Object a;

    public klb0(Object obj) {
        this.a = obj;
    }

    public final pim0 a() {
        llb0 llb0Var = new llb0();
        llb0Var.O0 = this.a;
        return llb0Var;
    }

    public final void b(pim0 pim0Var) {
        ((llb0) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klb0) && this.a.equals(((klb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cy30.m("LayoutIdElement(layoutId=", this.a, ")");
    }
}
