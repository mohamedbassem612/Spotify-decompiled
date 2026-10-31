package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class wog0 extends hog0 implements epg0 {
    public volatile fpg0 c;

    public wog0(Object obj, int i) {
        super(obj, i);
        this.c = ipg0.t;
    }

    @Override // p.epg0
    public final fpg0 a() {
        return this.c;
    }

    @Override // p.log0
    public final Object getValue() {
        return this.c.get();
    }
}
