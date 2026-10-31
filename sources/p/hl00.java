package p;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.kidsentitybanning.banning.v1.BanStatusResponse;
import com.spotify.kidsgraduation.v1.RequestGraduationRequest;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hl00 implements Function, mkf1, Producer, jrn0, w7r0, pah {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public hl00(tlu tluVar) {
        this.a = (byte) 11;
        j3r j3rVar = rzq.y;
        this.b = l2p1.f(new w1k(new l2r[]{tluVar}));
    }

    public static void g(ImageView imageView, az70 az70Var, s7v s7vVar) {
        if (s7vVar == null) {
            ((ixg) az70Var).k(imageView, (ird1) null);
            return;
        }
        p811 p811Var = new p811();
        j3v j3vVar = new j3v(p811Var, (byte) 29);
        pw70 pw70Var = (pw70) imageView.getTag(2131429630);
        if (pw70Var == null) {
            pw70Var = new pw70(imageView, s7vVar);
            imageView.setTag(2131429630, pw70Var);
        }
        pw70Var.c = j3vVar;
        pw70Var.b = s7vVar;
        Object tag = imageView.getTag(2131429221);
        h7k1 h7k1Var = tag instanceof h7k1 ? (h7k1) tag : null;
        if (h7k1Var != null) {
            h7k1Var.a();
        }
        h7k1 h7k1Var2 = new h7k1(imageView, az70Var);
        imageView.setTag(2131429221, h7k1Var2);
        imageView.addOnAttachStateChangeListener(h7k1Var2);
        p811Var.a = h7k1Var2;
        h7k1Var2.c = pw70Var;
        try {
            ixg ixgVar = h7k1Var2.a;
            if (ixgVar != null) {
                ixgVar.j(h7k1Var2);
            }
        } catch (RuntimeException e) {
            h7k1Var2.a();
            throw e;
        }
    }

    public static HubsImmutableComponentBundle j(u570 u570Var) {
        y570 y570Var = u570Var.b;
        j570 j570Var = (j570) y570Var.j().get(u570Var.a);
        if (j570Var != null) {
            HubsImmutableComponentBundle hubsImmutableComponentBundle = ((sc70) j570Var).b.c;
            Iterator it = hubsImmutableComponentBundle.s().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith("ubi:")) {
                    return hubsImmutableComponentBundle;
                }
            }
        }
        return y570Var.r();
    }

    public static hl00 k(Context context, Uri uri) {
        return new hl00(context, uri);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, onm onmVar) {
        n230 n230Var;
        if (onmVar instanceof n230) {
            n230Var = (n230) onmVar;
            int i = n230Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n230Var.c = i - Integer.MIN_VALUE;
            } else {
                n230Var = new n230(this, onmVar);
            }
        } else {
            n230Var = new n230(this, onmVar);
        }
        Object objK = n230Var.a;
        int i2 = n230Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            vwm1 vwm1Var = (vwm1) this.b;
            zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
            zsm1VarP.q(str);
            dbs dbsVar = new dbs(vwm1Var.e(zsm1VarP.build()), (byte) 1);
            n230Var.c = 1;
            objK = b5p1.k(dbsVar, n230Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) objK;
        if (yourLibraryDecorateResponse != null) {
            return t6p1.p(yourLibraryDecorateResponse);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0207 A[DONT_INVERT] */
    public Object apply(Object obj) {
        CompletableCreate completableCreateG;
        Object objInvoke;
        byte b = this.a;
        lnm vh80Var = null;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                return ((re10) obj2).a.b(((zd10) obj).a).map(wdu0.R0);
            case 3:
                return ((AtomicBoolean) obj2).compareAndSet(false, true) ? Observable.just(obj) : Observable.timer(500L, TimeUnit.MILLISECONDS).map(new jg(obj));
            case 7:
                j8x0 j8x0Var = (j8x0) obj;
                p410 p410Var = (p410) obj2;
                if (!j8x0Var.e || !((gdx0) p410Var.g).a.t()) {
                    return Observable.just(j8x0Var);
                }
                j8x0 j8x0VarA = j8x0.a(j8x0Var, 0, (List) null, (String) null, false, false, 0, 4, 47);
                return rqt0.F((q8n) p410Var.h, new xr00(p410Var, vh80Var, (byte) 15)).toObservable().map(new qo30(j8x0VarA, p410Var, (byte) 1)).onErrorResumeNext(new j3v(j8x0VarA, (byte) 23));
            case 8:
                ((va40) obj2).getClass();
                return va40.c((BanStatusResponse) obj);
            case 10:
                f0b0 f0b0Var = (f0b0) obj2;
                int iOrdinal = ((ufw) obj).a.ordinal();
                if (iOrdinal == 0) {
                    uo21 uo21VarN = RequestGraduationRequest.n();
                    uo21VarN.n();
                    RequestGraduationRequest requestGraduationRequest = (RequestGraduationRequest) uo21VarN.build();
                    g0b0 g0b0Var = f0b0Var.a;
                    requestGraduationRequest.getClass();
                    completableCreateG = g0b0Var.g(requestGraduationRequest);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    completableCreateG = j2h1.D(igu.b, new m850(f0b0Var, vh80Var, b2));
                }
                return completableCreateG.d(Observable.just(m000.f)).onErrorReturn(d710.e);
            case 15:
                po91 po91Var = ((n980) obj2).b.e;
                return Single.just(Boolean.valueOf(po91Var.b.b(po91Var.a, (String) obj).i(po91.c))).map(o610.g);
            case 16:
                PlayerState playerState = (PlayerState) obj;
                h72 h72Var = (h72) obj2;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strContextUri = playerState.contextUri();
                strContextUri.getClass();
                String strUid = contextTrack != null ? contextTrack.uid() : null;
                String str = strUid == null ? "" : strUid;
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                uh80 uh80Var = new uh80(false, strUri == null ? "" : strUri, str, false, strContextUri, false, false, (String) null, false, false, 2016);
                if (contextTrack == null) {
                    return uh80Var;
                }
                String strUid2 = contextTrack.uid();
                String strUri2 = contextTrack.uri();
                boolean z = Boolean.parseBoolean((String) contextTrack.metadata().get("is_audiobook_chapter"));
                String strX = l4o1.x(contextTrack);
                if (strX != null) {
                    String str2 = l4o1.v(contextTrack) ? strX : null;
                    if (str2 != null) {
                        strUid2.getClass();
                        vh80Var = new vh80(496, str2, strUid2, false, "");
                    }
                }
                Set set = s4b1.f;
                int iOrdinal2 = uic.x(strUri2).c.ordinal();
                if (iOrdinal2 != 166) {
                    if (iOrdinal2 == 416) {
                        return uh80Var;
                    }
                    if (iOrdinal2 != 652) {
                        if (iOrdinal2 != 844) {
                            if (iOrdinal2 != 926) {
                                return uh80Var;
                            }
                            if (vh80Var == null) {
                                strUid2.getClass();
                                strUri2.getClass();
                                boolean z2 = h72Var.I(contextTrack) ? true : Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_add"));
                                boolean z3 = h72Var.I(contextTrack) ? false : Boolean.parseBoolean((String) contextTrack.metadata().get("collection.in_collection"));
                                String str3 = (String) contextTrack.metadata().get("save_track.uri");
                                boolean zJ = l4o1.J(contextTrack);
                                ((ln91) h72Var.e).getClass();
                                int iA = ln91.a(contextTrack);
                                return new uh80(z3, strUri2, strUid2, z2, strContextUri, zJ, iA == 1 || iA == 2, str3, false, false, 1792);
                            }
                        } else if (vh80Var == null) {
                            if (z) {
                                boolean z4 = Boolean.parseBoolean((String) contextTrack.metadata().get("is_pre_release"));
                                strUid2.getClass();
                                return new vh80(368, strContextUri, strUid2, z4, strContextUri);
                            }
                            strUid2.getClass();
                            strUri2.getClass();
                            return new uh80(Boolean.parseBoolean((String) contextTrack.metadata().get("collection.in_collection")), strUri2, strUid2, true, strContextUri, false, false, (String) null, false, false, 2016);
                        }
                    } else if (vh80Var == null) {
                        return uh80Var;
                    }
                } else if (vh80Var == null) {
                    return uh80Var;
                }
                return vh80Var;
            case 22:
                Integer num = (Integer) obj;
                Map map = (Map) ((idd1) ((at7) obj2).h).getValue();
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    arrayList.add(new pv51(new r1b0(iIntValue, str4), iIntValue == num.intValue()));
                }
                return arrayList;
            case 23:
                dgb0 dgb0Var = (dgb0) ((egb0) obj2).f.getValue();
                int i = dgb0Var.c;
                return dgb0Var.a(mno1.z((Drawable) obj, i, i, 4), null, null);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((fzb0) obj2).e = true;
                return new jxo0((tyb0) obj);
            case 25:
                oy21 oy21Var = (py21) obj;
                pdb0 pdb0Var = new pdb0((q3c0) obj2, (byte) 10);
                if (oy21Var instanceof ly21) {
                    objInvoke = CompletableEmpty.a;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = pdb0Var.invoke(oy21Var.a);
                }
                return (CompletableSource) objInvoke;
            default:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch next page of Liked Songs", new Object[0]);
                return (ejr0) obj2;
        }
    }

    public void b(ImageView imageView) {
        Object tag = imageView.getTag(2131429221);
        h7k1 h7k1Var = tag instanceof h7k1 ? (h7k1) tag : null;
        if (h7k1Var != null) {
            h7k1Var.a();
        }
        ((gw70) this.b).d(imageView);
    }

    public void c(int i) {
        ((kqd0) this.b).h.getBackground().setTint(i);
    }

    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        lr60 lr60Var = (lr60) this.b;
        sxo sxoVar = lr60Var.a;
        boolean z = obj instanceof rr60;
        rr60 rr60Var = z ? (rr60) obj : null;
        Context context = viewGroup.getContext();
        rr60 rr60Var2 = z ? (rr60) obj : null;
        sn4 sn4Var = lr60Var.c;
        hnl hnlVar = lr60Var.b;
        dlm dlmVar = xoi1.c(context) ? dlm.f : dlm.e;
        boolean z2 = xoi1.c(context) && hnlVar.f();
        boolean zC = xoi1.c(context);
        boolean zC2 = xoi1.c(context);
        boolean zC3 = xoi1.c(context);
        byte b = hnlVar.a;
        y2k1 y2k1Var = y2k1.c;
        switch (b) {
            case 0:
            case 1:
                break;
            default:
                y2k1Var = y2k1.b;
                break;
        }
        return sxoVar.a(viewGroup, rr60Var, new qr60(dlmVar, y2k1Var, z2, true, zC, true, zC2, zC3, rr60Var2 != null ? rr60Var2.b : true, rr60Var2 != null ? rr60Var2.c : false, sn4Var.h(), sn4Var.c(), lr60Var.d.a()), y3o0Var);
    }

    public void e() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, String str2, onm onmVar) {
        ld90 ld90Var;
        if (onmVar instanceof ld90) {
            ld90Var = (ld90) onmVar;
            int i = ld90Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld90Var.e = i - Integer.MIN_VALUE;
            } else {
                ld90Var = new ld90(this, onmVar);
            }
        } else {
            ld90Var = new ld90(this, onmVar);
        }
        Object objD = ld90Var.c;
        int i2 = ld90Var.e;
        if (i2 == 0) {
            hm5.M(objD);
            qmr qmrVar = (qmr) this.b;
            ld90Var.a = str;
            ld90Var.b = str2;
            ld90Var.e = 1;
            objD = qmrVar.d(str, str2, ld90Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = ld90Var.b;
            str = ld90Var.a;
            hm5.M(objD);
        }
        rdt rdtVar = (rdt) objD;
        if (rdtVar instanceof pdt) {
            return new hd90(((pdt) rdtVar).c);
        }
        if (!(rdtVar instanceof qdt)) {
            eg.o();
            return null;
        }
        qdt qdtVar = (qdt) rdtVar;
        x7i1 x7i1Var = qdtVar.b;
        if (x7i1Var != null) {
            boolean z = x7i1Var.b;
            if (qdtVar.a) {
                Boolean boolValueOf = Boolean.valueOf(z);
                Boolean bool = Boolean.TRUE;
                if (u890.j(boolValueOf, bool)) {
                    return new id90(true, str2, x7i1Var);
                }
                return u890.j(Boolean.valueOf(z), bool) ? new jd90(str) : new id90(false, str2, x7i1Var);
            }
        }
        return new hd90(false);
    }

    public Object get() {
        return new DispatcherWorker(((ex80) this.b).d);
    }

    public oj80 h(u570 u570Var) {
        x6h1 x6h1VarG = y1a1.G(j(u570Var), ((jik1) this.b).getViewUri().a);
        x6h1VarG.g = "22.0.0";
        byte b = 12;
        x5j1 x5j1Var = new x5j1(x6h1VarG.a(), (byte) 12);
        String str = u570Var.a;
        str.getClass();
        switch (str.hashCode()) {
            case -1994546462:
                b = !str.equals("toggleLikeStateClick") ? (byte) -1 : (byte) 0;
                break;
            case -1643378308:
                b = !str.equals("toggleFollowStateClick") ? (byte) -1 : (byte) 1;
                break;
            case -918454268:
                b = !str.equals("toggleAddStateClick") ? (byte) -1 : (byte) 2;
                break;
            case -223600006:
                b = !str.equals("contextMenuClick") ? (byte) -1 : (byte) 3;
                break;
            case 94750088:
                b = !str.equals("click") ? (byte) -1 : (byte) 4;
                break;
            case 102022252:
                b = !str.equals("longClick") ? (byte) -1 : (byte) 5;
                break;
            case 138933059:
                b = !str.equals("accessoryItemClick") ? (byte) -1 : (byte) 6;
                break;
            case 367447762:
                b = !str.equals("rightAccessoryClick") ? (byte) -1 : (byte) 7;
                break;
            case 435226370:
                b = !str.equals("swipeRight") ? (byte) -1 : (byte) 8;
                break;
            case 822828607:
                b = !str.equals("togglePlayStateClick") ? (byte) -1 : (byte) 9;
                break;
            case 1146009782:
                b = !str.equals("showMoreClick") ? (byte) -1 : (byte) 10;
                break;
            case 1503669817:
                b = !str.equals("openLearnMoreClick") ? (byte) -1 : (byte) 11;
                break;
            case 1537877601:
                if (!str.equals("swipeLeft")) {
                    b = -1;
                }
                break;
            case 2006452987:
                b = !str.equals("singleItemButtonClick") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
                return x5j1Var.f();
            case 5:
                return new oj80(x5j1Var, "long_hit");
            case 8:
                return new oj80(x5j1Var, "swipe_right");
            case 12:
                return new oj80(x5j1Var, "swipe_left");
            default:
                return new oj80(x5j1Var, "");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, String str2, onm onmVar) {
        md90 md90Var;
        if (onmVar instanceof md90) {
            md90Var = (md90) onmVar;
            int i = md90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                md90Var.c = i - Integer.MIN_VALUE;
            } else {
                md90Var = new md90(this, onmVar);
            }
        } else {
            md90Var = new md90(this, onmVar);
        }
        Object objF = md90Var.a;
        int i2 = md90Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            md90Var.c = 1;
            objF = f(str, str2, md90Var);
            Object obj = d9n.a;
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        kd90 kd90Var = (kd90) objF;
        if (kd90Var instanceof hd90) {
            return new ed90(((hd90) kd90Var).a);
        }
        if (kd90Var instanceof id90) {
            return dd90.a;
        }
        if (kd90Var instanceof jd90) {
            return new fd90(((jd90) kd90Var).a);
        }
        eg.o();
        return null;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((wf2) obj).e(intent, txa0.a);
            default:
                d2d0 d2d0Var = (d2d0) obj;
                Set set = s4b1.f;
                x1d0 x1d0VarC = d2d0Var.c(intent, th61Var.a, d2d0.d(uic.x(intent.getDataString())));
                if (x1d0VarC instanceof v1d0) {
                    return ((v1d0) x1d0VarC).a;
                }
                if (!(x1d0VarC instanceof w1d0)) {
                    eg.o();
                    return null;
                }
                z1d0 z1d0Var = new z1d0(1);
                String str = ((w1d0) x1d0VarC).a;
                d2d0Var.b(z1d0Var, intent, str);
                return new hrn0(yyc0.class, new fzc0(str, intent), a6w0.a);
        }
    }

    public void m(nvh0 nvh0Var) {
        kv40 kv40Var = (kv40) this.b;
        if (nvh0Var != kv40Var.e) {
            k220 k220Var = kv40.F;
            return;
        }
        lwh0 lwh0VarC = kv40Var.c();
        if (kv40Var.h() != lwh0VarC) {
            kv40Var.l(lwh0VarC, 2, 2, true);
        }
    }

    public void n(int i) {
        kv40 kv40Var = (kv40) this.b;
        lwh0 lwh0VarC = kv40Var.c();
        if (kv40Var.h() != lwh0VarC) {
            kv40Var.l(lwh0VarC, 3, i, true);
        }
    }

    public void o(int i, String str) {
        lwh0 lwh0Var;
        kv40 kv40Var = (kv40) this.b;
        ArrayList<lwh0> arrayList = kv40Var.i;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                lwh0Var = null;
                break;
            }
            lwh0Var = (lwh0) it.next();
            if (lwh0Var.b() == kv40Var.r && TextUtils.equals(str, lwh0Var.b)) {
                break;
            }
        }
        if (lwh0Var != null) {
            kv40Var.l(lwh0Var, 3, i, true);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (lwh0 lwh0Var2 : arrayList) {
            if (lwh0Var2.b() == kv40Var.r) {
                arrayList2.add(lwh0Var2.b);
            }
        }
        arrayList2.toString();
    }

    public Cursor p(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean q() {
        String str = ((lmo) this.b).a;
        return u890.j(str, "default") || u890.j(str, "podcasts-chip") || u890.j(str, "cardashians-chip");
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public k241 m399get() {
        return ((dnd0) this.b).Y;
    }

    public /* synthetic */ hl00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public hl00(iac0 iac0Var, k241 k241Var) {
        this.a = (byte) 28;
        dnd0 dnd0Var = new dnd0(k241Var);
        this.b = dnd0Var;
        dnd0Var.f(iac0Var, new cnd0());
    }

    public hl00() {
        this.a = (byte) 6;
        this.b = new rl1((byte) 15);
    }

    public hl00(Context context, Uri uri) {
        this.a = (byte) 5;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
