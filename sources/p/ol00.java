package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ol00 implements y2i1 {
    public final String b;

    public ol00(String str) {
        this.b = str;
    }

    @Override // p.y2i1
    public final boolean a(String str) {
        return this.b.length() == str.length();
    }

    @Override // p.y2i1
    public final boolean b(String str) {
        return this.b.equals(str);
    }
}
