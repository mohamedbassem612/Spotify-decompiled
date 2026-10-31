package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r09 {
    public final Integer a;
    public final Object b;
    public final xnw0 c;

    public r09(Integer num, Object obj, xnw0 xnw0Var) {
        this.a = num;
        if (obj == null) {
            bhn0.i("Null payload");
            throw null;
        }
        this.b = obj;
        this.c = xnw0Var;
    }

    public static r09 a(Object obj) {
        return new r09(null, obj, xnw0.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r09)) {
            return false;
        }
        r09 r09Var = (r09) obj;
        Integer num = r09Var.a;
        Integer num2 = this.a;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.b.equals(r09Var.b) && this.c.equals(r09Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (this.c.hashCode() ^ (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=null, eventContext=null}";
    }
}
