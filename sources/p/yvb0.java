package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yvb0 extends hab0 implements xu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb0(int i, long j, j2i j2iVar) {
        super(3);
        this.a = i;
        this.b = j;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        int iC = l1d.C(this.a);
        qim0 qim0VarY = nim0.a;
        if (iC != 0) {
            if (iC == 1) {
                qim0VarY = voo1.y(qim0VarY, voo1.c);
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                qim0VarY = voo1.y(qim0VarY, voo1.g);
            }
        }
        w3d1.a(qim0VarY, (hw61) null, this.b, 0L, 0.0f, 0.0f, (qqb) null, apo.r(1745338334, new ak10(this.c, (byte) 11), b0kVar), b0kVar, 12582912, 122);
        return rih1.a;
    }
}
