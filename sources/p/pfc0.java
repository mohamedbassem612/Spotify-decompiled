package p;

import android.content.res.Resources;
import java.util.Iterator;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pfc0 extends k9 {
    public final /* synthetic */ byte c;
    public final zwm1 d;
    public final z0t e;
    public final t0t f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pfc0(zwm1 zwm1Var, z0t z0tVar, mwm1 mwm1Var, t0t t0tVar, byte b) {
        super(mwm1Var, (byte) 15);
        this.c = b;
        this.d = zwm1Var;
        this.e = z0tVar;
        this.f = t0tVar;
    }

    public final Object A0(YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) {
        int i;
        lwp0 jwp0Var;
        byte b = this.c;
        z0t z0tVar = this.e;
        int i2 = 3;
        boolean z = false;
        zwm1 zwm1Var = this.d;
        switch (b) {
            case 0:
                Iterator it = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().y().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 += ((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it.next()).i();
                }
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().u()) {
                    i = 1;
                } else {
                    int i4 = caa.a[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().t().ordinal()];
                    if (i4 != 1) {
                        i = i4 != 2 ? 4 : 3;
                    } else {
                        i = 2;
                    }
                }
                int iOrdinal = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().s().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    jwp0Var = rwp0.a;
                } else if (iOrdinal == 2) {
                    jwp0Var = hwp0.a;
                } else if (iOrdinal == 3) {
                    jwp0Var = new jwp0(0);
                } else if (iOrdinal == 4) {
                    jwp0Var = new vwp0(1, 0);
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    jwp0Var = lwp0.a;
                }
                Resources resources = zwm1Var.b;
                String string = i3 == 0 ? resources.getString(2131956858) : resources.getQuantityString(2131820709, i3, Integer.valueOf(i3));
                if (z0tVar.a.a() && yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().r()) {
                    z = true;
                }
                return new kcc0(string, z, i, jwp0Var);
            default:
                String string2 = zwm1Var.b.getString(2131956875);
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
                if (z0tVar.a.a()) {
                    gtm1 gtm1VarS = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.s();
                    if ((gtm1VarS == null ? -1 : fqm1.a[gtm1VarS.ordinal()]) == 1 ? yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().r() : false) {
                        z = true;
                    }
                }
                return new tpm1(string2, i2, z);
        }
    }

    public final YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs k1(String str) {
        byte b = this.c;
        osm1 osm1Var = osm1.INCLUDE_IF_NOT_EMPTY;
        osm1 osm1Var2 = osm1.INCLUDE_ALWAYS;
        t0t t0tVar = this.f;
        z0t z0tVar = this.e;
        switch (b) {
            case 0:
                psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                nsm1 nsm1VarO = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                if (z0tVar.a.a() && !t0tVar.a(fsm1.a)) {
                    osm1Var = osm1Var2;
                }
                nsm1VarO.q(osm1Var);
                nsm1VarO.n();
                psm1VarP.v((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) nsm1VarO.build());
                return psm1VarP.build();
            default:
                psm1 psm1VarP2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                nsm1 nsm1VarO2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                if (z0tVar.a.a() && !t0tVar.a(gsm1.a)) {
                    osm1Var = osm1Var2;
                }
                nsm1VarO2.q(osm1Var);
                psm1VarP2.z(nsm1VarO2);
                return psm1VarP2.build();
        }
    }
}
