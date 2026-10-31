package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum k8r implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    GREEN("green"),
    /* JADX INFO: Fake field, exist only in values array */
    WHITE("white"),
    /* JADX INFO: Fake field, exist only in values array */
    RED("red"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE("blue"),
    DEFAULT("default");

    public final String a;

    k8r(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
