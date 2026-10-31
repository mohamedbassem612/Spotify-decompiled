package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wos0 extends ips0 {
    public xos0 g;

    @Override // p.ips0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof xky0) {
            return super.containsKey((xky0) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof osi1) {
            return super/*java.util.AbstractMap*/.containsValue((osi1) obj);
        }
        return false;
    }

    @Override // p.ips0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof xky0) {
            return (osi1) super.get((xky0) obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof xky0) ? obj2 : (osi1) super/*java.util.AbstractMap*/.getOrDefault((xky0) obj, (osi1) obj2);
    }

    @Override // p.ips0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final xos0 f() {
        kug1 kug1Var = this.c;
        xos0 xos0Var = this.g;
        if (kug1Var != xos0Var.b) {
            this.b = new ypa((byte) 17, false);
            xos0Var = new xos0(this.c, c());
        }
        this.g = xos0Var;
        return xos0Var;
    }

    @Override // p.ips0, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof xky0) {
            return (osi1) super.remove((xky0) obj);
        }
        return null;
    }
}
