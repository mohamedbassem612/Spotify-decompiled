package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v09 extends c810 {
    public final Integer a;

    public v09(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c810)) {
            return false;
        }
        Integer num = this.a;
        v09 v09Var = (v09) ((c810) obj);
        if (num == null) {
            return v09Var.a == null;
        }
        return num.equals(v09Var.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
