package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum bh4 implements z0z {
    OFF("off"),
    /* JADX INFO: Fake field, exist only in values array */
    ADD_TO_QUEUE("add_to_queue"),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_MATCHES("group_matches");

    public final String a;

    bh4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
