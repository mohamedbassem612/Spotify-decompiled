package p;

import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryLabelAndImage;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vqg extends k9 {
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqg(zwm1 zwm1Var, mwm1 mwm1Var) {
        super(mwm1Var, (byte) 15);
        this.c = (byte) 0;
        this.d = zwm1Var;
    }

    public final Object A0(YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) {
        int i;
        byte b = this.c;
        Object obj = this.d;
        int i2 = 3;
        int i3 = 4;
        switch (b) {
            case 0:
                String name = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getName();
                String string = ((zwm1) obj).b.getString(2131956876);
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().u()) {
                    i2 = 1;
                } else {
                    int i4 = caa.a[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().t().ordinal()];
                    if (i4 == 1) {
                        i2 = 2;
                    } else if (i4 != 2) {
                        i2 = 4;
                    }
                }
                return new jpg(i2, name, string);
            case 1:
                String strJ = ((zwm1) obj).a.j(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.v().getPublishDate());
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().u()) {
                    i2 = 1;
                } else {
                    int i5 = caa.a[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().t().ordinal()];
                    if (i5 == 1) {
                        i2 = 2;
                    } else if (i5 != 2) {
                        i2 = 4;
                    }
                }
                return new f9o0(strJ, i2);
            case 2:
                String name2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getName();
                String strB = ((zwm1) obj).b(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.u().p(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.u().o());
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().u()) {
                    i2 = 1;
                } else {
                    int i6 = caa.a[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().t().ordinal()];
                    if (i6 == 1) {
                        i2 = 2;
                    } else if (i6 != 2) {
                        i2 = 4;
                    }
                }
                return new bmu0(i2, name2, strB);
            case 3:
                zwm1 zwm1Var = (zwm1) obj;
                String strN = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.x().n();
                ktm1 ktm1VarP = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.x().p();
                int[] iArr = r2w0.a;
                int i7 = iArr[ktm1VarP.ordinal()];
                if (i7 != 1) {
                    i = i7 != 2 ? 3 : 2;
                } else {
                    i = 1;
                }
                String strF = zwm1Var.f(i, strN);
                String strQ = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().q();
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().u()) {
                    i3 = 1;
                } else {
                    int i8 = caa.a[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().t().ordinal()];
                    if (i8 == 1) {
                        i3 = 2;
                    } else if (i8 == 2) {
                        i3 = 3;
                    }
                }
                int i9 = iArr[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.x().p().ordinal()];
                if (i9 == 1) {
                    i2 = 1;
                } else if (i9 == 2) {
                    i2 = 2;
                }
                return new ozv0(strF, strQ, i3, i2);
            default:
                String name3 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getName();
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().u()) {
                    i2 = 1;
                } else {
                    int i10 = caa.a[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().t().ordinal()];
                    if (i10 == 1) {
                        i2 = 2;
                    } else if (i10 != 2) {
                        i2 = 4;
                    }
                }
                return new vde0(name3, i2);
        }
    }

    public YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs k1(String str) {
        switch (this.c) {
            case 0:
                psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                nsm1 nsm1VarO = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO.q(osm1.INCLUDE_ALWAYS);
                psm1VarP.r(nsm1VarO);
                return psm1VarP.build();
            case 1:
                psm1 psm1VarP2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                msm1 msm1VarO = YourLibraryConfig$YourLibraryLabelAndImage.o();
                msm1VarO.r(str);
                psm1VarP2.y((YourLibraryConfig$YourLibraryLabelAndImage) msm1VarO.build());
                return psm1VarP2.build();
            case 2:
            case 3:
            default:
                return super.k1(str);
            case 4:
                psm1 psm1VarP3 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                nsm1 nsm1VarO2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO2.q(((gjc1) this.d).a(new m9d0[]{sc41.b}) ? osm1.INCLUDE_IF_NOT_EMPTY : osm1.EXCLUDE);
                psm1VarP3.w(nsm1VarO2);
                return psm1VarP3.build();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqg(mwm1 mwm1Var, Object obj, byte b) {
        super(mwm1Var, (byte) 15);
        this.c = b;
        this.d = obj;
    }
}
