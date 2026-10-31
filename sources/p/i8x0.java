package p;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i8x0 extends z511 {
    public String O0;
    public boolean P0;
    public boolean Q0;
    public final fx6 X;
    public final wb00 Y;
    public final gtc1 Z;
    public final xfx d;
    public final h0y e;
    public final j3v f;
    public final mjv g;
    public final fx6 h;
    public final vyq0 i;
    public final lmw t;
    public int a1 = 7;
    public List N0 = z6x.a;
    public vu30 R0 = gbw0.X;
    public xu30 S0 = mgn0.W0;
    public iu30 T0 = k1x0.Y;
    public xu30 U0 = mgn0.X0;
    public iu30 V0 = k1x0.t;
    public iu30 W0 = k1x0.i;
    public iu30 X0 = k1x0.X;
    public vu30 Y0 = gbw0.Y;
    public xu30 Z0 = mgn0.Y0;

    public i8x0(xfx xfxVar, h0y h0yVar, j3v j3vVar, mjv mjvVar, fx6 fx6Var, vyq0 vyq0Var, lmw lmwVar, fx6 fx6Var2, wb00 wb00Var, gtc1 gtc1Var) {
        this.d = xfxVar;
        this.e = h0yVar;
        this.f = j3vVar;
        this.g = mjvVar;
        this.h = fx6Var;
        this.i = vyq0Var;
        this.t = lmwVar;
        this.X = fx6Var2;
        this.Y = wb00Var;
        this.Z = gtc1Var;
    }

    public final obx0 A(int i) {
        v9x0 v9x0Var = (v9x0) this.N0.get(i);
        if (v9x0Var instanceof obx0) {
            return (obx0) v9x0Var;
        }
        return null;
    }

    public final void B(zis0 zis0Var, obx0 obx0Var, int i, tqw tqwVar) {
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        if (u890.j(zis0Var, yis0.c)) {
            this.R0.invoke(obx0Var, Integer.valueOf(i));
            return;
        }
        if (u890.j(zis0Var, yis0.b)) {
            this.T0.invoke(obx0Var);
            return;
        }
        if (u890.j(zis0Var, yis0.d)) {
            this.S0.invoke(obx0Var, Integer.valueOf(i), tv80VarY);
            return;
        }
        if (u890.j(zis0Var, yis0.a)) {
            this.U0.invoke(obx0Var, Integer.valueOf(i), tv80VarY);
            return;
        }
        if (!(zis0Var instanceof xis0)) {
            eg.o();
            return;
        }
        bro1 bro1Var = ((xis0) zis0Var).a;
        if (u890.j(bro1Var, uis0.b)) {
            this.Z0.invoke(obx0Var, Integer.valueOf(i), tv80VarY);
            return;
        }
        if (u890.j(bro1Var, wis0.b)) {
            this.Y0.invoke(obx0Var, Integer.valueOf(i));
            return;
        }
        if (u890.j(bro1Var, ris0.b)) {
            this.V0.invoke(obx0Var);
            return;
        }
        if (u890.j(bro1Var, qis0.b)) {
            this.W0.invoke(obx0Var);
            return;
        }
        if (u890.j(bro1Var, sis0.b)) {
            this.X0.invoke(obx0Var);
        } else if (bro1Var instanceof tis0) {
            this.T0.invoke(obx0Var);
        } else {
            if (u890.j(bro1Var, vis0.b)) {
                return;
            }
            eg.o();
        }
    }

    public final int e() {
        return this.N0.size();
    }

    public final int g(int i) {
        if (i >= this.N0.size()) {
            return 1;
        }
        v9x0 v9x0Var = (v9x0) this.N0.get(i);
        if (v9x0Var instanceof zbx0) {
            return 0;
        }
        if (!(v9x0Var instanceof obx0)) {
            eg.o();
            return 0;
        }
        nbx0 nbx0Var = ((obx0) v9x0Var).a;
        if (u890.j(nbx0Var, fbx0.a)) {
            return 7;
        }
        if (u890.j(nbx0Var, hbx0.a)) {
            return 8;
        }
        if (u890.j(nbx0Var, gbx0.a)) {
            return 10;
        }
        if (nbx0Var instanceof kbx0) {
            return 9;
        }
        if (u890.j(nbx0Var, jbx0.a)) {
            return 4;
        }
        if (u890.j(nbx0Var, lbx0.a)) {
            return 5;
        }
        if (u890.j(nbx0Var, dbx0.a)) {
            return 3;
        }
        if (u890.j(nbx0Var, ibx0.a)) {
            return 2;
        }
        if (u890.j(nbx0Var, ebx0.a)) {
            return 6;
        }
        eg.f("Type not supported");
        return 0;
    }

    public final void n(int i, w611 w611Var) {
        String str;
        f8x0 f8x0Var = (f8x0) w611Var;
        switch (g(i)) {
            case 0:
                v9x0 v9x0Var = (v9x0) this.N0.get(i);
                zbx0 zbx0Var = v9x0Var instanceof zbx0 ? (zbx0) v9x0Var : null;
                if (zbx0Var != null && (str = zbx0Var.a) != null) {
                    b6s b6sVar = ((c8x0) f8x0Var).U0;
                    TextView textView = (TextView) b6sVar.d;
                    b6sVar.c.setText(str);
                    textView.setVisibility(8);
                    break;
                }
                break;
            case 1:
                obx0 obx0VarA = A(i - 1);
                if (obx0VarA != null) {
                    e8x0 e8x0Var = (e8x0) f8x0Var;
                    nbx0 nbx0Var = obx0VarA.a;
                    fcs fcsVar = e8x0Var.U0;
                    Resources resources = ((w611) e8x0Var).a.getResources();
                    String string = nbx0Var.equals(ibx0.a) ? resources.getString(2131960548) : nbx0Var.equals(lbx0.a) ? resources.getString(2131960546) : resources.getString(2131960547);
                    string.getClass();
                    ((EncoreButton) ((m021) fcsVar.b).c).setText(string);
                    fcsVar.n(new ewq0(1, (byte) 16));
                    break;
                }
                break;
            case 2:
                obx0 obx0VarA2 = A(i);
                if (obx0VarA2 != null) {
                    dtw dtwVar = ((ssu0) f8x0Var).U0;
                    boolean z = this.P0;
                    h8x0 h8x0Var = new h8x0(4, this, i8x0.class, "handlePlaylistRowEvent", "handlePlaylistRowEvent(Lcom/spotify/profile/uiusecases/playlistrowprofile/PlaylistRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 0);
                    String str2 = obx0VarA2.b;
                    zru0 zru0Var = new zru0(str2, obx0VarA2.c, obx0VarA2.d, obx0VarA2.e, z, new yvs0(h8x0Var, obx0VarA2, i, (byte) 10));
                    joa0 joa0Var = new joa0(str2);
                    tka0 tka0Var = dtw.C;
                    dtwVar.k(zru0Var, joa0Var, (vu30) null);
                    ha71.C(dtwVar, i);
                    break;
                }
                break;
            case 3:
                obx0 obx0VarA3 = A(i);
                if (obx0VarA3 != null) {
                    if (f8x0Var instanceof q830) {
                        dtw dtwVar2 = ((q830) f8x0Var).U0;
                        String str3 = this.O0;
                        h8x0 h8x0Var2 = new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 2);
                        boolean zJ = u890.j(str3, obx0VarA3.b);
                        String str4 = obx0VarA3.b;
                        String str5 = obx0VarA3.c;
                        String str6 = obx0VarA3.d;
                        String str7 = str6 == null ? "" : str6;
                        String str8 = obx0VarA3.e;
                        p830 p830Var = new p830(str4, str5, str7, str8 == null ? "" : str8, !zJ, obx0VarA3.f.a, new say(h8x0Var2, obx0VarA3, i, (byte) 8));
                        joa0 joa0Var2 = new joa0(str4);
                        tka0 tka0Var2 = dtw.C;
                        dtwVar2.k(p830Var, joa0Var2, (vu30) null);
                        ha71.C(dtwVar2, i);
                    } else if (f8x0Var instanceof ux6) {
                        ((ux6) f8x0Var).F(obx0VarA3, i, true, this.O0, new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 3));
                    }
                    break;
                }
                break;
            case 4:
                obx0 obx0VarA4 = A(i);
                if (obx0VarA4 != null) {
                    q730 q730Var = obx0VarA4.f;
                    String str9 = obx0VarA4.e;
                    String str10 = obx0VarA4.d;
                    String str11 = obx0VarA4.b;
                    if (f8x0Var instanceof k830) {
                        dtw dtwVar3 = ((k830) f8x0Var).U0;
                        boolean z2 = this.P0;
                        String str12 = this.O0;
                        h8x0 h8x0Var3 = new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 4);
                        boolean zJ2 = u890.j(str12, str11);
                        String str13 = obx0VarA4.b;
                        String str14 = obx0VarA4.c;
                        String str15 = str10 == null ? "" : str10;
                        String str16 = str9 == null ? "" : str9;
                        boolean z3 = !zJ2;
                        boolean z4 = q730Var.a;
                        Set set = s4b1.f;
                        String strS = uic.x(str13).s();
                        i830 i830Var = new i830(str13, str14, str15, str16, z3, z4, z2, strS == null ? "" : strS, new say(h8x0Var3, obx0VarA4, i, (byte) 7));
                        joa0 joa0Var3 = new joa0(str11);
                        tka0 tka0Var3 = dtw.C;
                        dtwVar3.k(i830Var, joa0Var3, (vu30) null);
                        ha71.C(dtwVar3, i);
                    } else if (f8x0Var instanceof v830) {
                        dtw dtwVar4 = ((v830) f8x0Var).U0;
                        String str17 = this.O0;
                        h8x0 h8x0Var4 = new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 5);
                        boolean zJ3 = u890.j(str17, str11);
                        String str18 = obx0VarA4.b;
                        String str19 = obx0VarA4.c;
                        String str20 = str10 == null ? "" : str10;
                        String str21 = str9 == null ? "" : str9;
                        boolean z5 = !zJ3;
                        boolean z6 = q730Var.a;
                        Set set2 = s4b1.f;
                        String strS2 = uic.x(str18).s();
                        t830 t830Var = new t830(str18, str19, str20, str21, z5, z6, strS2 == null ? "" : strS2, new say(h8x0Var4, obx0VarA4, i, (byte) 9));
                        joa0 joa0Var4 = new joa0(str11);
                        tka0 tka0Var4 = dtw.C;
                        dtwVar4.k(t830Var, joa0Var4, (vu30) null);
                        ha71.C(dtwVar4, i);
                    }
                    break;
                }
                break;
            case 5:
                obx0 obx0VarA5 = A(i);
                if (obx0VarA5 != null) {
                    ((ux6) f8x0Var).F(obx0VarA5, i, false, this.O0, new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 1));
                    break;
                }
                break;
            case 6:
                obx0 obx0VarA6 = A(i);
                if (obx0VarA6 != null) {
                    f8x0Var.E(obx0VarA6, i);
                    break;
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                obx0 obx0VarA7 = A(i);
                if (obx0VarA7 != null) {
                    f8x0Var.E(obx0VarA7, i);
                    break;
                }
                break;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        xfx xfxVar = (xfx) this.e.b;
        xfx xfxVar2 = this.h.a;
        xfx xfxVar3 = this.d;
        switch (i) {
            case 0:
                return new c8x0(new b6s(xfxVar3.e.a(), (byte) 1));
            case 1:
                return new e8x0(new fcs(xfxVar3.a.a, (byte) 12));
            case 2:
                int i2 = ssu0.V0;
                px6 px6Var = new px6((xfx) this.i.b, (byte) 7);
                tka0 tka0Var = dtw.C;
                return new ssu0(mhc.d(viewGroup.getContext(), viewGroup, px6Var, (drw) null, 24));
            case 3:
                if (g8x0.a[l1d.C(this.a1)] == 2) {
                    int i3 = q830.V0;
                    px6 px6Var2 = new px6((xfx) this.g.b, (byte) 2);
                    tka0 tka0Var2 = dtw.C;
                    return new q830(mhc.d(viewGroup.getContext(), viewGroup, px6Var2, (drw) null, 24));
                }
                int i4 = ux6.V0;
                px6 px6Var3 = new px6(xfxVar2, (byte) 0);
                tka0 tka0Var3 = dtw.C;
                return new ux6(mhc.d(viewGroup.getContext(), viewGroup, px6Var3, (drw) null, 24));
            case 4:
                int iC = l1d.C(this.a1);
                if (iC == 0) {
                    int i5 = k830.V0;
                    px6 px6Var4 = new px6(xfxVar, (byte) 1);
                    tka0 tka0Var4 = dtw.C;
                    return new k830(mhc.d(viewGroup.getContext(), viewGroup, px6Var4, (drw) null, 24));
                }
                if (iC != 1) {
                    int i6 = k830.V0;
                    px6 px6Var5 = new px6(xfxVar, (byte) 1);
                    tka0 tka0Var5 = dtw.C;
                    return new k830(mhc.d(viewGroup.getContext(), viewGroup, px6Var5, (drw) null, 24));
                }
                int i7 = v830.V0;
                px6 px6Var6 = new px6((xfx) this.f.b, (byte) 3);
                tka0 tka0Var6 = dtw.C;
                return new v830(mhc.d(viewGroup.getContext(), viewGroup, px6Var6, (drw) null, 24));
            case 5:
                int i8 = ux6.V0;
                px6 px6Var7 = new px6(xfxVar2, (byte) 0);
                tka0 tka0Var7 = dtw.C;
                return new ux6(mhc.d(viewGroup.getContext(), viewGroup, px6Var7, (drw) null, 24));
            case 6:
                wfx wfxVar = xfxVar3.c;
                return new g980(this, new nwr(wfxVar.b, wfxVar.a, (byte) 1));
            case 7:
                int i9 = ko30.X0;
                px6 px6Var8 = new px6((xfx) this.t.b, (byte) 4);
                h8x0 h8x0Var = new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 6);
                z6v0 z6v0Var = new z6v0(this, (byte) 20);
                tka0 tka0Var8 = dtw.C;
                return new ko30(mhc.d(viewGroup.getContext(), viewGroup, px6Var8, (drw) null, 24), h8x0Var, z6v0Var);
            case 8:
                int i10 = g980.Z0;
                px6 px6Var9 = new px6((xfx) this.Y.b, (byte) 6);
                h8x0 h8x0Var2 = new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 7);
                tka0 tka0Var9 = dtw.C;
                return new g980(mhc.d(viewGroup.getContext(), viewGroup, px6Var9, (drw) null, 24), h8x0Var2, (byte) 0);
            case 9:
                int i11 = g980.Z0;
                px6 px6Var10 = new px6(this.Z.a, (byte) 8);
                h8x0 h8x0Var3 = new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 8);
                tka0 tka0Var10 = dtw.C;
                return new g980(mhc.d(viewGroup.getContext(), viewGroup, px6Var10, (drw) null, 24), h8x0Var3, (char) 0);
            case 10:
                int i12 = g980.Z0;
                px6 px6Var11 = new px6(this.X.a, (byte) 5);
                h8x0 h8x0Var4 = new h8x0(4, this, i8x0.class, "handlePeopleRowEvent", "handlePeopleRowEvent(Lcom/spotify/profile/uiusecases/peoplerowprofile/PeopleRowProfile$Events;Lcom/spotify/profile/profilelist/model/ProfileListItem;ILcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 9);
                tka0 tka0Var11 = dtw.C;
                return new g980(mhc.d(viewGroup.getContext(), viewGroup, px6Var11, (drw) null, 24), h8x0Var4);
            default:
                eg.f("View type not supported");
                return null;
        }
    }
}
