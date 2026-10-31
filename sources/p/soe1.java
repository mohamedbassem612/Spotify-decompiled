package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum soe1 {
    CPU("device.cpu"),
    /* JADX INFO: Fake field, exist only in values array */
    GC("device.gc"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOCKING_GC("device.blocking_gc"),
    NATIVE_PSS("device.native_pss"),
    DALVIK_PSS("device.dalvik_pss"),
    OTHER_PSS("device.other_pss");

    public final String a;

    soe1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
