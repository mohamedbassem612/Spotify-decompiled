package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kbh0 extends g7 {
    public final /* synthetic */ mbh0 a;

    public kbh0(mbh0 mbh0Var) {
        this.a = mbh0Var;
    }

    public final int b() {
        return this.a.a.groupCount() + 1;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super/*p.k6*/.contains((String) obj);
        }
        return false;
    }

    public final Object get(int i) {
        String strGroup = this.a.a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
