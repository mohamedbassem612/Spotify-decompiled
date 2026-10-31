package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vvj extends wnn0 {
    public final uvj h;
    public final j2i i;

    public vvj(uvj uvjVar, tka0 tka0Var, j2i j2iVar) {
        super((mzn0) uvjVar, tka0Var, (Map) b7x.a);
        this.h = uvjVar;
        this.i = j2iVar;
    }

    @Override // p.wnn0
    public final vnn0 a() {
        return (tvj) super.a();
    }

    @Override // p.wnn0
    public final vnn0 b() {
        return new tvj(this.h, this.i);
    }

    public vvj(uvj uvjVar, String str, j2i j2iVar) {
        super(uvjVar, -1, str);
        this.h = uvjVar;
        this.i = j2iVar;
    }
}
