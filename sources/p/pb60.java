package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pb60 implements rb60 {
    public final ta60 a;
    public final String b;

    public pb60(ta60 ta60Var) {
        this.a = ta60Var;
        this.b = ta60Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb60) && u890.j(this.a, ((pb60) obj).a);
    }

    @Override // p.rb60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
