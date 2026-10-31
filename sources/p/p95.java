package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p95 extends k9 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p95(List list, boolean z) {
        super(list, (byte) 3);
        this.c = (byte) 2;
    }

    public final fba c0() {
        switch (this.c) {
            case 0:
                return new y8h((List) this.b, (byte) 0);
            case 1:
                return new p650((List) this.b, (byte) 0);
            case 2:
                return new y8h((List) this.b, (byte) 1);
            case 3:
                return new aav0((List) this.b);
            case 4:
                return new p650((List) this.b, (byte) 1);
            default:
                return v1();
        }
    }

    public sw61 v1() {
        return new sw61((List) this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p95(List list, byte b) {
        super(list, (byte) 3);
        this.c = b;
    }
}
