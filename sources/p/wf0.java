package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.ai.creation.v2.PlaylistSavedRequest;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wf0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wf0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void run() {
        String string;
        ou80 ou80Var;
        String str;
        ArrayList arrayList;
        byte b = this.a;
        String str2 = "";
        ckf1 ckf1Var = ckf1.b;
        String str3 = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                yf0 yf0Var = (yf0) obj3;
                yf0Var.c.a.d(yf0Var.a.invoke((ContextTrack) obj2), obj);
                break;
            case 1:
                ((j62) ((tm) obj3).e).d((bpt0) obj2, (String) obj);
                break;
            case 2:
                ((j62) ((bs0) obj3).e).d((bpt0) obj2, (String) obj);
                break;
            case 3:
                Uri data = ((Intent) obj3).getData();
                if (data != null) {
                    ((bv8) ((kly0) ((b72) obj2).c).get()).a(((e961) obj).call(), data);
                }
                break;
            case 4:
                pnd pndVar = (pnd) obj3;
                cnd cndVar = (cnd) obj2;
                hpc1 hpc1Var = cndVar.a;
                blc0[] blc0VarArr = pnd.Z;
                Context context = pndVar.a;
                if (hpc1Var == null || (string = context.getString(2131963745)) == null) {
                    string = context.getString(2131963746);
                }
                pndVar.b.k(new er91((fs91) null, string, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                dnd dndVar = (ind) obj;
                pndVar.h.onNext(new mnd(true, dndVar.a, dndVar.c, cndVar.a, cndVar.b, true));
                break;
            case 5:
                String str4 = ((pbm) obj3).c;
                if (str4 != null) {
                    tqw tqwVar = (tqw) obj2;
                    ug3 ug3Var = (ug3) obj;
                    if (tqwVar != null) {
                        ((xrn0) ug3Var.c).a(str4, n3o1.y(tqwVar));
                    }
                }
                break;
            case 6:
                mmr0 mmr0Var = (mmr0) obj3;
                pdm pdmVar = (pdm) mmr0Var.a;
                PlayerState playerState = (PlayerState) mmr0Var.b;
                dfm dfmVar = (dfm) obj2;
                ((ugm) dfmVar.f).a(new ngm(playerState, ((ContextTrack) playerState.track().b()).uri()), pdmVar, ((Boolean) ((iu30) dfmVar.g).invoke(playerState)).booleanValue(), cvl1.d((tqw) obj));
                break;
            case 7:
                z7n z7nVar = (z7n) obj2;
                if (!((y7n) obj3).a && !z7nVar.d.get()) {
                    z7nVar.c.c.post((Runnable) obj);
                    break;
                }
                break;
            case 8:
                e7p0 e7p0Var = ((qzo0) obj).h;
                if (((izo0) obj3).a) {
                    tqw tqwVar2 = (tqw) obj2;
                    if (tqwVar2 != null) {
                        e7p0.e(e7p0Var, n3o1.y(tqwVar2));
                    } else {
                        e7p0Var.c();
                    }
                }
                break;
            case 9:
                ((ywv0) obj3).g(esg1.d.b(((tig0) obj2).a), (tv80) obj);
                break;
            case 10:
                p811 p811Var = (p811) obj3;
                Disposable disposable = (Disposable) p811Var.a;
                if (disposable != null) {
                    disposable.dispose();
                }
                p811Var.a = null;
                ((kt91) ((mzr0) obj2).c).i((izv0) obj);
                break;
            case 11:
                s880 s880Var = (s880) obj;
                q0w0 q0w0Var = (q0w0) obj3;
                if (!q0w0Var.i) {
                    ((kt91) obj2).k((er91) s880Var.f);
                    if (q0w0Var.h) {
                        fn31.T(cto1.q((dg30) s880Var.c), (q8n) s880Var.a, 0, new r0w0(s880Var, null, (byte) 0), 2);
                    }
                }
                break;
            case 12:
                ((LinkedHashMap) obj3).put((String) obj2, (odx0) obj);
                break;
            case 13:
                sdx0 sdx0Var = (sdx0) obj3;
                m5k m5kVar = sdx0Var.e;
                bpb1 bpb1Var = sdx0Var.g;
                LinkedHashMap linkedHashMapO = sqg0.O((Map) bpb1Var.getValue(), (LinkedHashMap) obj2);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    odx0 odx0Var = (odx0) linkedHashMapO.get((String) it.next());
                    if (odx0Var != null && !o7h.i0(m5kVar.B(), odx0Var.b())) {
                        m5kVar.A(odx0Var.b());
                    }
                }
                bpb1Var.getClass();
                bpb1Var.m((Object) null, linkedHashMapO);
                break;
            case 14:
                sdx0 sdx0Var2 = (sdx0) obj3;
                udx0 udx0Var = (udx0) obj2;
                sdx0Var2.h.b(yoi1.i(sdx0Var2.c.a(udx0Var.a), o6x.a).onErrorReturnItem(new m6w(false)).filter(rdx0.b).firstOrError().observeOn(sdx0Var2.b).subscribe(new qg7(sdx0Var2, (List) obj, udx0Var, (byte) 22), new dy40(sdx0Var2, (byte) 17)));
                break;
            case 15:
                j23 j23Var = (c23) ((mzr0) obj3).c;
                String str5 = ((zwu0) obj2).k;
                r23 r23Var = j23Var.a;
                PlaylistSavedRequest.Builder builderNewBuilder = PlaylistSavedRequest.newBuilder();
                builderNewBuilder.setMessageId(str5);
                builderNewBuilder.setPlaylistUri((String) obj);
                r23Var.c(builderNewBuilder.build()).ignoreElement();
                break;
            case 16:
                String str6 = ((p9z0) obj3).c;
                if (str6 != null) {
                    tqw tqwVar3 = (tqw) obj2;
                    q9z0 q9z0Var = (q9z0) obj;
                    if (tqwVar3 != null) {
                        q9z0Var.a.a(str6, n3o1.y(tqwVar3));
                        q9z0Var.f.invoke();
                    }
                }
                break;
            case 17:
                ri11 ri11Var = (ri11) obj3;
                ri11Var.e.a(jvs0.b);
                j380 j380VarMetadata = ((ContextTrack) ((PlayerState) obj2).track().b()).metadata();
                if (j380VarMetadata != null && (str = (String) j380VarMetadata.get("image_xlarge_url")) != null) {
                    str2 = str;
                }
                a1r0 a1r0Var = ri11Var.g;
                String str7 = nik1.z6.a;
                tqw tqwVar4 = (tqw) obj;
                if (tqwVar4 != null && (ou80Var = n3o1.y(tqwVar4).a) != null) {
                    str3 = ou80Var.a;
                }
                a1r0.j(a1r0Var, str7, str3, cy30.g("imageUri", str2), false, 8);
                break;
            case 18:
                xh71.b((xh71) ((im0) obj3).d, (wa71) obj2, (Bundle) null, new vm71("now-playing"), (tv80) obj, (List) null, 18);
                break;
            case 19:
                wn91 wn91Var = (wn91) obj;
                qp91 qp91Var = (qp91) obj3;
                nn61 nn61Var = (nn61) obj2;
                if (qp91Var != null) {
                    un91 un91VarA = ((uww0) nn61Var.b).a();
                    un91VarA.f2 = wn91Var;
                    qp91Var.b(un91VarA);
                    break;
                } else {
                    th30 th30Var = (th30) nn61Var.c;
                    if (th30Var.L || th30Var.U()) {
                        n57.e("Cannot show SmartShufflePlayModePicker: FragmentManager is destroyed or the state is saved.");
                        break;
                    } else if (!(th30Var.G("PlayModePicker.Dialog") instanceof t2u)) {
                        un91 un91VarA2 = ((uww0) nn61Var.b).a();
                        un91VarA2.f2 = wn91Var;
                        un91VarA2.g1(th30Var, "PlayModePicker.Dialog");
                        break;
                    }
                }
                break;
            case 20:
                mn91 mn91Var = ((io91) obj3).c;
                String str8 = (String) obj2;
                bma1 bma1Var = (bma1) mn91.c.get((dug) obj);
                if (bma1Var != null) {
                    hma1 hma1VarEdit = mn91Var.b.b(mn91Var.a, str8).edit();
                    hma1VarEdit.a(bma1Var, true);
                    hma1VarEdit.h();
                }
                break;
            case 21:
                oss ossVar = (oss) ((ynb0) ((bs0) obj3).d).get();
                ContextTrack contextTrack = (ContextTrack) obj2;
                bsa1 bsa1Var = ((csa1) obj).a;
                sta1 sta1Var = new sta1(bsa1Var.a, bsa1Var.b, bsa1Var.c, bsa1Var.d);
                ((PublishSubject) ossVar.a.i).onNext(new mss(new tta1((!l4o1.P(contextTrack) || l4o1.G(contextTrack)) ? n9x0.P0 : l4o1.F(contextTrack) ? o9x0.P0 : s9x0.Q0, sta1Var)));
                break;
            case 22:
                r0d1 r0d1Var = (r0d1) obj3;
                p0d1 p0d1Var = (p0d1) obj2;
                ArrayList arrayList2 = new ArrayList();
                if (p0d1Var.c && r0d1Var.g) {
                    arrayList2.add(q0d1.a);
                }
                w281 w281Var = p0d1Var.f;
                if ((w281Var != null ? nln.s(w281Var) : null) instanceof smb) {
                    arrayList2.add(q0d1.b);
                }
                q0d1 q0d1Var = (q0d1) o7h.s0(arrayList2);
                if (q0d1Var == null) {
                    q0d1Var = q0d1.c;
                }
                int iOrdinal = q0d1Var.ordinal();
                if (iOrdinal == 0) {
                    r0d1Var.b.a(r0d1Var.e, r6h1.c).a("");
                    break;
                } else if (iOrdinal == 1) {
                    lzn0 lzn0Var = r0d1Var.d;
                    String str9 = p0d1Var.a;
                    lzn0Var.a("spotify:gatedcontent:bottomsheet:".concat(ihc1.V0(str9, ':', str9)), (tv80) obj, (Bundle) null);
                    break;
                } else if (iOrdinal != 2) {
                    eg.o();
                    break;
                } else {
                    String str10 = p0d1Var.e;
                    o0d1 o0d1Var = new o0d1(str10 != null ? str10 : "", p0d1Var.b);
                    cd8 cd8Var = p0d1Var.g;
                    if (cd8Var != null) {
                        ArrayList<bd8> arrayList3 = cd8Var.a;
                        arrayList = new ArrayList(q7h.U(arrayList3, 10));
                        for (bd8 bd8Var : arrayList3) {
                            arrayList.add(new t0d1(bd8Var.d, bd8Var.b, bd8Var.a, p0d1Var.c, false));
                        }
                    } else {
                        arrayList = z6x.a;
                    }
                    n0d1 n0d1Var = new n0d1(o0d1Var, arrayList);
                    r2a1 r2a1Var = r0d1Var.c;
                    th30 th30Var2 = (th30) r2a1Var.b;
                    if (!(th30Var2.G("SupplementaryContentBottomSheet") instanceof l0d1) && !th30Var2.U()) {
                        l0d1 l0d1VarA = ((uww0) r2a1Var.c).a();
                        l0d1VarA.T0(mno1.h(new mmr0[]{new mmr0("supplementary_content_sheet_model", n0d1Var)}));
                        l0d1VarA.g1(th30Var2, "SupplementaryContentBottomSheet");
                        break;
                    }
                }
                break;
            case 23:
                t45 t45Var = (t45) obj3;
                t45Var.g((String) obj2);
                ((c0f1) obj).b.b(t45Var.e());
                break;
            case 24:
                im0 im0Var = (im0) obj3;
                ((i8h1) ((idd1) im0Var.X).getValue()).m(((fkf1) im0Var.i).a(ckf1Var, (String) obj2, (fvf1) obj), (xj61) null);
                break;
            default:
                mtf1 mtf1Var = (mtf1) obj3;
                ((i8h1) mtf1Var.i.getValue()).m(mtf1Var.h.a(ckf1Var, (String) obj2, (fvf1) obj), (xj61) null);
                break;
        }
    }
}
