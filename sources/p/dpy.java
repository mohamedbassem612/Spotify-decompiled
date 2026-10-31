package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dpy {
    public final ley a;

    public dpy(ley leyVar) {
        this.a = leyVar;
    }

    public final fzy a(mhy mhyVar) {
        boolean z = mhyVar instanceof bhy;
        ley leyVar = this.a;
        if (z) {
            bhy bhyVar = (bhy) mhyVar;
            as3 as3Var = bhyVar.d;
            aey aeyVar = bhyVar.b.e;
            int iOrdinal = as3Var.ordinal();
            if (iOrdinal == 0) {
                switch (aeyVar.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return fzy.t;
                    default:
                        n57.e("Invalid entity, " + aeyVar);
                        return leyVar.a() ? fzy.h : fzy.N0;
                }
            }
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            switch (aeyVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return fzy.c;
                default:
                    n57.e("Invalid entity, " + aeyVar);
                    return leyVar.a() ? fzy.b : fzy.g;
            }
        }
        if (mhyVar instanceof lhy) {
            return fzy.P0;
        }
        if (mhyVar instanceof khy) {
            return fzy.O0;
        }
        if (mhyVar instanceof chy) {
            return fzy.d;
        }
        if (mhyVar instanceof dhy) {
            return fzy.X;
        }
        if (mhyVar instanceof fhy) {
            return fzy.e;
        }
        if (mhyVar instanceof ihy) {
            int iOrdinal2 = ((ihy) mhyVar).b.ordinal();
            if (iOrdinal2 == 0) {
                return leyVar.a() ? fzy.h : fzy.N0;
            }
            if (iOrdinal2 == 1) {
                return leyVar.a() ? fzy.b : fzy.g;
            }
            eg.o();
            return null;
        }
        if (!(mhyVar instanceof ghy)) {
            if (mhyVar instanceof ahy) {
                return fzy.i;
            }
            if (mhyVar instanceof hhy) {
                return fzy.Z;
            }
            eg.o();
            return null;
        }
        int iOrdinal3 = ((ghy) mhyVar).d.ordinal();
        if (iOrdinal3 == 0) {
            return fzy.Y;
        }
        if (iOrdinal3 == 1) {
            return fzy.f;
        }
        eg.o();
        return null;
    }
}
