package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum vln implements v190 {
    CREATE_ITEM_KIND_UNSPECIFIED(0),
    CREATE_ITEM_KIND_PLAYLIST(1),
    CREATE_ITEM_KIND_FOLDER(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    vln(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
