package p;

import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uux0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ytp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uux0(ytp0 ytp0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ytp0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ytp0 ytp0Var = this.b;
        switch (b) {
            case 0:
                mrf1 mrf1Var = (mrf1) obj;
                y11 y11Var = (y11) ytp0Var.e;
                mtx0 mtx0Var = (mtx0) ytp0Var.b;
                boolean z = mrf1Var instanceof lrf1;
                b7x b7xVar = b7x.a;
                if (z) {
                    lrf1 lrf1Var = (lrf1) mrf1Var;
                    int i = lrf1Var.b;
                    String str = lrf1Var.a;
                    if (lrf1Var.d.a == 1) {
                        String str2 = lrf1Var.c;
                        pdl0 pdl0Var = mtx0Var.b;
                        Integer numValueOf = Integer.valueOf(i);
                        x6h1 x6h1VarC = pdl0Var.b.c();
                        x6h1VarC.i.add(new a7h1("track_row", str2, numValueOf, str, (String) null));
                        x6h1VarC.j = false;
                        x6h1 x6h1VarC2 = x6h1VarC.a().c();
                        x6h1VarC2.i.add(new a7h1("album_cover", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else {
                        String str3 = lrf1Var.c;
                        pdl0 pdl0Var2 = mtx0Var.b;
                        Integer numValueOf2 = Integer.valueOf(i);
                        x6h1 x6h1VarC3 = pdl0Var2.b.c();
                        x6h1VarC3.i.add(new a7h1("track_row", str3, numValueOf2, str, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("album_cover", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    y11Var.accept(new jsx0(str));
                    return rih1Var;
                }
                if (mrf1Var instanceof jrf1) {
                    jrf1 jrf1Var = (jrf1) mrf1Var;
                    String str4 = jrf1Var.a;
                    int i2 = jrf1Var.b;
                    String str5 = jrf1Var.c;
                    pdl0 pdl0Var3 = mtx0Var.b;
                    Integer numValueOf3 = Integer.valueOf(i2);
                    x6h1 x6h1VarC5 = pdl0Var3.b.c();
                    x6h1VarC5.i.add(new a7h1("track_row", str5, numValueOf3, str4, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("plus_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str4)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    y11Var.accept(new hsx0(str4));
                    return rih1Var;
                }
                if (mrf1Var instanceof irf1) {
                    irf1 irf1Var = (irf1) mrf1Var;
                    String str6 = irf1Var.a;
                    int i3 = irf1Var.b;
                    String str7 = irf1Var.c;
                    pdl0 pdl0Var4 = mtx0Var.b;
                    Integer numValueOf4 = Integer.valueOf(i3);
                    x6h1 x6h1VarC7 = pdl0Var4.b.c();
                    x6h1VarC7.i.add(new a7h1("track_row", str7, numValueOf4, str6, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("plus_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("deselect_entity_in_list", 1, Collections.singletonMap("entity_to_be_deselected", str6)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    y11Var.accept(new ftx0(str6));
                    return rih1Var;
                }
                if (mrf1Var instanceof hrf1) {
                    hrf1 hrf1Var = (hrf1) mrf1Var;
                    String str8 = hrf1Var.a;
                    int i4 = hrf1Var.b;
                    String str9 = hrf1Var.c;
                    pdl0 pdl0Var5 = mtx0Var.b;
                    Integer numValueOf5 = Integer.valueOf(i4);
                    x6h1 x6h1VarC9 = pdl0Var5.b.c();
                    x6h1VarC9.i.add(new a7h1("track_row", str9, numValueOf5, str8, (String) null));
                    x6h1VarC9.j = false;
                    mtx0Var.a.m(new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", str8)), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    y11Var.accept(new osx0(str8));
                    return rih1Var;
                }
                if (!(mrf1Var instanceof krf1)) {
                    eg.o();
                    return null;
                }
                krf1 krf1Var = (krf1) mrf1Var;
                String str10 = krf1Var.a;
                int i5 = krf1Var.b;
                String str11 = krf1Var.c;
                pdl0 pdl0Var6 = mtx0Var.b;
                Integer numValueOf6 = Integer.valueOf(i5);
                x6h1 x6h1VarC10 = pdl0Var6.b.c();
                x6h1VarC10.i.add(new a7h1("track_row", str11, numValueOf6, str10, (String) null));
                x6h1VarC10.j = false;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("minus_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str10)), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                y11Var.accept(new osx0(str10));
                return rih1Var;
            default:
                p1f0 p1f0Var = (p1f0) ytp0Var.d;
                int iOrdinal = ((vk51) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ((SeeMoreTextView) p1f0Var.d).A(new wk51(4, ((SeeMoreTextView) p1f0Var.d).getText().toString()));
                        return rih1Var;
                    }
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                ((y11) ytp0Var.e).accept(vrx0.a);
                return rih1Var;
        }
    }
}
