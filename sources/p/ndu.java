package p;

import com.spotify.storage.localstorage.DiskAlmostFullActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ndu extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DiskAlmostFullActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndu(DiskAlmostFullActivity diskAlmostFullActivity, byte b) {
        super(2);
        this.a = b;
        this.b = diskAlmostFullActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        DiskAlmostFullActivity diskAlmostFullActivity = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                idx idxVar = new idx(13);
                boolean zI = x340Var2.i(diskAlmostFullActivity);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    obj3 = objT;
                    mdu mduVar = new mdu(diskAlmostFullActivity, (byte) 1);
                    x340Var2.s0(mduVar);
                    obj3 = mduVar;
                }
                obj3 = objT;
                Function0 function0 = (Function0) obj3;
                if (ihc1.y0("disk_almost_full_ok")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50("disk_almost_full_ok"), function0), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, oji.c, x340Var2, 0, 48, 2044);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    boolean zI2 = x340Var4.i(diskAlmostFullActivity);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == fkj0.X) {
                        obj4 = objT2;
                        mdu mduVar2 = new mdu(diskAlmostFullActivity, (byte) 0);
                        x340Var4.s0(mduVar2);
                        obj4 = mduVar2;
                    }
                    obj4 = objT2;
                    mqo1.e((Function0) obj4, (i3u) null, (vu30) null, oji.a, oji.b, apo.r(-369429489, new ndu(diskAlmostFullActivity, z ? (byte) 1 : (byte) 0), x340Var4), (vu30) null, x340Var4, 224256, 70);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(231174353, new ndu(diskAlmostFullActivity, b2), x340Var6), x340Var6, 3078, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
