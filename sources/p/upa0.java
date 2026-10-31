package p;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.base.java.logging.Logger;
import com.spotify.karaoke.esperanto.proto.KaraokePostVocalVolumeRequest;
import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.share.linkpreview.impl.proto.Image;
import com.spotify.share.linkpreview.impl.proto.SetLinkPreviewRequest;
import com.spotify.share.linkpreview.impl.proto.UploadLinkPreviewFields;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class upa0 implements Function, xi7, ObservableOnSubscribe, qiw, Function3, bra {
    public final /* synthetic */ byte a;
    public Object b;

    public upa0(k4e0 k4e0Var, hx41 hx41Var) {
        this.a = (byte) 11;
        this.b = hx41Var;
    }

    public static upa0 d(String str, byte[] bArr) {
        fuq0 fuq0Var;
        spa0 spa0VarQ = tpa0.q();
        spa0VarQ.d();
        ((we40) spa0VarQ).b.s(str);
        byte b = 0;
        ghc ghcVarD = ohc.d(0, bArr, bArr.length);
        spa0VarQ.d();
        ((we40) spa0VarQ).b.t(ghcVarD);
        int iC = l1d.C(1);
        if (iC == 0) {
            fuq0Var = fuq0.c;
        } else if (iC == 1) {
            fuq0Var = fuq0.d;
        } else if (iC == 2) {
            fuq0Var = fuq0.e;
        } else {
            if (iC != 3) {
                hhg1.n("Unknown output prefix type");
                return null;
            }
            fuq0Var = fuq0.f;
        }
        spa0VarQ.d();
        ((we40) spa0VarQ).b.r(fuq0Var);
        return new upa0(spa0VarQ.a(), b);
    }

    public List a(UUID uuid) {
        fp20 fp20VarY = z561.Y(new ug9(this, uuid, (byte) 2), z561.f0(zdh0.Q0, new i46(new ioh0(this, (lnm) null), (byte) 3)));
        qlu qluVar = new qlu(new ep20(fp20VarY), zdh0.R0);
        if (!qluVar.hasNext()) {
            return z6x.a;
        }
        Object next = qluVar.next();
        if (!qluVar.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayListH = ydh.h(next);
        while (qluVar.hasNext()) {
            arrayListH.add(qluVar.next());
        }
        return arrayListH;
    }

    public Object apply(Object obj) {
        xlk1 xlk1Var;
        Calendar calendar = null;
        switch (this.a) {
            case 1:
                th61 th61Var = (th61) obj;
                wza0 wza0Var = (wza0) this.b;
                if (voo1.p(th61Var) && th61Var.b) {
                    Single singleFlatMap = wza0Var.e.a().flatMap(new dg90(wza0Var, (byte) 4));
                    singleFlatMap.getClass();
                    return singleFlatMap;
                }
                Single singleJust = Single.just(n941.a);
                singleJust.getClass();
                return singleJust;
            case 2:
            case 4:
            case 5:
            case 7:
            case 12:
            case 14:
            case 15:
            case 20:
            case 21:
            default:
                Object obj2 = ((Map) ((bjx) this.b).c).get((NowPlayingMiniMode) obj);
                obj2.getClass();
                return (SingleSource) obj2;
            case 3:
                PlayerState playerState = (PlayerState) obj;
                String strContextUri = playerState.contextUri();
                q3c0 q3c0Var = (q3c0) this.b;
                String strP = q3c0Var.g.s().p();
                q3c0Var.f.getClass();
                boolean z = u890.j(strContextUri, strP) || u890.j(strContextUri, (String) q5y.a().get(strP));
                String str = (String) playerState.contextMetadata().get("lexicon_expiration_time");
                if (str != null) {
                    try {
                        q6r q6rVar = q3c0Var.j;
                        Date date = q6rVar.b.parse(str);
                        if (date == null) {
                            throw new ParseException("Could not parse release timestamp", 0);
                        }
                        Calendar calendarD = q6rVar.a.d();
                        calendarD.setTime(date);
                        calendar = calendarD;
                    } catch (ParseException unused) {
                    }
                }
                CharSequence charSequence = (CharSequence) playerState.contextMetadata().get("loading.failed");
                return new t3c0(z, !(charSequence == null || ihc1.y0(charSequence)), q3c0Var.i.d(), calendar);
            case 6:
                va81 va81Var = (va81) obj;
                ega1 ega1Var = ((qsn) this.b).b;
                if (u890.j(ega1Var.a, yfa1.a)) {
                    return new kia1(izc0.a[l1d.C(va81Var.m)] == 1 ? bga1.a : aga1.a);
                }
                return new kia1(ega1Var.a);
            case 8:
                ppd0 ppd0Var = (ppd0) this.b;
                if (((Boolean) obj).booleanValue()) {
                    return ppd0Var.c.J(new z8c0(ppd0Var.f, (byte) 4)).X(new dg90(ppd0Var, (byte) 11));
                }
                int i = Flowable.a;
                return FlowableEmpty.b;
            case 9:
                return ((PlayerState) obj).isPlaying() ? ((yud0) this.b).e.a(new d9u0("listening-parties", false)).ignoreElement() : CompletableEmpty.a;
            case 10:
                Throwable th = (Throwable) obj;
                enh enhVar = (enh) this.b;
                Logger.e(th, "Failed to load comments for entity, uri: " + enhVar + ".entityUri", new Object[0]);
                return new eoh(enhVar.a, enhVar.b, th);
            case 11:
                return new y051("", ((hx41) this.b).b, q851.a);
            case 13:
                if (((Boolean) obj).booleanValue()) {
                    return CompletableEmpty.a;
                }
                return ((bge0) this.b).c.j.d(SetShufflingContextCommand.create(false)).ignoreElement();
            case 16:
                bif0 bif0Var = (bif0) obj;
                int iOrdinal = bif0Var.a.ordinal();
                if (iOrdinal == 0) {
                    xlk1Var = xlk1.c;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    xlk1Var = xlk1.b;
                }
                wlk1 wlk1Var = (wlk1) this.b;
                wlk1Var.getClass();
                aoa0 aoa0VarN = KaraokePostVocalVolumeRequest.n();
                aoa0VarN.n(xlk1Var.a());
                KaraokePostVocalVolumeRequest karaokePostVocalVolumeRequestBuild = aoa0VarN.build();
                be beVar = wlk1Var.d;
                karaokePostVocalVolumeRequestBuild.getClass();
                return Completable.k(beVar.c(karaokePostVocalVolumeRequestBuild)).d(Observable.just(new jjf0(true, xlk1Var))).onErrorReturn(new dg90(bif0Var, (byte) 19));
            case 17:
                hj81 hj81Var = (hj81) obj;
                if ((hj81Var instanceof ej81) || (hj81Var instanceof gj81)) {
                    return (zia) ((uo5) this.b).d;
                }
                if (hj81Var instanceof fj81) {
                    return Observable.empty();
                }
                eg.o();
                return null;
            case 18:
                qug0 qug0Var = (qug0) this.b;
                return rqt0.F(qug0Var.a, new p6d0(qug0Var, (lnm) null, (byte) 29));
            case 19:
                gbc0 gbc0Var = (gbc0) obj;
                if (gbc0Var instanceof ebc0) {
                    return (Observable) ((tzf0) this.b).invoke();
                }
                if (gbc0Var instanceof fbc0) {
                    return Observable.just(geh0.a);
                }
                eg.o();
                return null;
            case 22:
                return new yki0(!((oki0) this.b).c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(ckc0 ckc0Var, onm onmVar) throws IOException {
        dkc0 dkc0Var;
        rk61 rk61VarN;
        rk61 rk61Var;
        jxh1 jxh1VarN;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        mmr0 mmr0Var;
        bh70 bh70Var;
        if (onmVar instanceof dkc0) {
            dkc0Var = (dkc0) onmVar;
            int i = dkc0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkc0Var.e = i - Integer.MIN_VALUE;
            } else {
                dkc0Var = new dkc0(this, onmVar);
            }
        } else {
            dkc0Var = new dkc0(this, onmVar);
        }
        Object obj = dkc0Var.c;
        int i2 = dkc0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            rk61VarN = SetLinkPreviewRequest.n();
            String str6 = ckc0Var.a;
            if (str6 != null) {
                Uri uri = Uri.parse(str6);
                if (wmo1.l(uri)) {
                    yfu yfuVar = (yfu) this.b;
                    dkc0Var.a = rk61VarN;
                    dkc0Var.b = ckc0Var;
                    dkc0Var.e = 1;
                    Object objJ = yfuVar.j(uri, dkc0Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    obj = objJ;
                    rk61Var = rk61VarN;
                } else {
                    rk61VarN.q(str6);
                }
            }
            jxh1VarN = UploadLinkPreviewFields.n();
            xjc0 xjc0Var = ckc0Var.b;
            str = xjc0Var.a;
            if (str != null) {
                jxh1VarN.r(str);
            }
            str2 = xjc0Var.b;
            if (str2 != null) {
                jxh1VarN.q(str2);
            }
            str3 = xjc0Var.c;
            if (str3 != null) {
                jxh1VarN.t(str3);
            }
            str4 = xjc0Var.d;
            if (str4 != null) {
                jxh1VarN.n(str4);
            }
            str5 = xjc0Var.e;
            if (str5 != null) {
                jxh1VarN.s(str5);
            }
            rk61VarN.r((UploadLinkPreviewFields) jxh1VarN.build());
            return rk61VarN.build();
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ckc0Var = dkc0Var.b;
        rk61Var = dkc0Var.a;
        hm5.M(obj);
        byte[] bArr = (byte[]) obj;
        String strGuessContentTypeFromStream = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(bArr));
        if (strGuessContentTypeFromStream == null) {
            strGuessContentTypeFromStream = "application/octet-stream";
        }
        if (strGuessContentTypeFromStream.equals("image/png")) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray == null) {
                hhg1.n("Failed to decode PNG bytes for JPEG conversion");
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    byteArray.getClass();
                    bitmapDecodeByteArray.recycle();
                    mmr0Var = new mmr0(byteArray, "image/jpeg");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                bitmapDecodeByteArray.recycle();
                throw th3;
            }
        } else {
            mmr0Var = new mmr0(bArr, strGuessContentTypeFromStream);
        }
        byte[] bArr2 = (byte[]) mmr0Var.a;
        String str7 = (String) mmr0Var.b;
        lp70 lp70VarN = Image.n();
        if (u890.j(str7, "image/jpeg")) {
            bh70Var = bh70.JPG;
        } else {
            if (!u890.j(str7, "image/png")) {
                hhg1.n(f4i1.f("Cannot convert ", str7, " to an image format"));
                return null;
            }
            bh70Var = bh70.PNG;
        }
        lp70VarN.n(bh70Var);
        hhc hhcVar = phc.b;
        lp70VarN.q(phc.e(0, bArr2, bArr2.length));
        rk61Var.n((Image) lp70VarN.build());
        rk61VarN = rk61Var;
        jxh1VarN = UploadLinkPreviewFields.n();
        xjc0 xjc0Var2 = ckc0Var.b;
        str = xjc0Var2.a;
        if (str != null) {
            jxh1VarN.r(str);
        }
        str2 = xjc0Var2.b;
        if (str2 != null) {
            jxh1VarN.q(str2);
        }
        str3 = xjc0Var2.c;
        if (str3 != null) {
            jxh1VarN.t(str3);
        }
        str4 = xjc0Var2.d;
        if (str4 != null) {
            jxh1VarN.n(str4);
        }
        str5 = xjc0Var2.e;
        if (str5 != null) {
            jxh1VarN.s(str5);
        }
        rk61VarN.r((UploadLinkPreviewFields) jxh1VarN.build());
        return rk61VarN.build();
    }

    public jhm c(String str, String str2, String str3) {
        return new jhm("campfire_leave_group_chat", hox.c, (fhm) null, 2131958549, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(zib0.e1, hyb0.b), new lhx(this, str, str2, str3, (byte) 26)), 244);
    }

    public List e() {
        qnf1 qnf1Var;
        Locale m231Var;
        List<kqg0> list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        for (kqg0 kqg0Var : list) {
            ArrayList arrayList2 = new ArrayList();
            int i = kqg0Var.a;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    qnf1Var = null;
                    break;
                }
                if (kqg0Var.b[i2] == 1) {
                    qnf1Var = kqg0Var.c[i2];
                    break;
                }
                i2++;
            }
            if (qnf1Var != null) {
                int i3 = qnf1Var.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    pnf1 pnf1VarA = qnf1Var.a(i4);
                    int i5 = pnf1VarA.a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ie30 ie30Var = pnf1VarA.d[i6];
                        String str = ie30Var.d;
                        if (str != null) {
                            try {
                                m231Var = Locale.forLanguageTag(str);
                            } catch (Throwable th) {
                                m231Var = new m231(th);
                            }
                            if (m231Var instanceof m231) {
                                m231Var = null;
                            }
                            Locale locale = m231Var;
                            if (locale != null) {
                                arrayList2.add(new nv7(locale, (ie30Var.f & 1) != 0));
                            }
                        }
                    }
                }
            }
            r7h.W(arrayList2, arrayList);
        }
        return o7h.j0(arrayList);
    }

    public ArrayList f() {
        qnf1 qnf1Var;
        ArrayList arrayList = new ArrayList();
        for (kqg0 kqg0Var : (List) this.b) {
            int i = kqg0Var.a;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    qnf1Var = null;
                    break;
                }
                if (kqg0Var.b[i2] == 3) {
                    qnf1Var = kqg0Var.c[i2];
                    break;
                }
                i2++;
            }
            if (qnf1Var != null) {
                int i3 = qnf1Var.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    pnf1 pnf1VarA = qnf1Var.a(i4);
                    int i5 = pnf1VarA.a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        arrayList.add(pnf1VarA.d[i6]);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hpc1 hpc1VarK = fqo1.K((ie30) it.next());
            if (hpc1VarK != null) {
                arrayList2.add(hpc1VarK);
            }
        }
        return arrayList2;
    }

    public ie30 g() {
        Object obj = null;
        r561 r561VarA = j2h1.A(new ioh0(this, (lnm) null));
        while (r561VarA.hasNext()) {
            Object next = r561VarA.next();
            if (((ie30) next).t != null) {
                obj = next;
                break;
            }
        }
        return (ie30) obj;
    }

    public List h() {
        List listA = a(h9v.b);
        return listA.isEmpty() ? a(h9v.a) : listA;
    }

    public a5l0 i(String str) {
        return new a5l0(str, (r6h1) this.b);
    }

    public n8d0 j(kph0 kph0Var) {
        d1i0 d1i0Var = (d1i0) this.b;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || i >= 33) {
            return fc11.J(Boolean.TRUE);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return !d1i0Var.k().h ? d1i0Var.o(true) : fc11.J(Boolean.TRUE);
        }
        x8a0 x8a0Var = new x8a0(this, kph0Var, (byte) 14);
        Handler handler = d1i0Var.c;
        Objects.requireNonNull(handler);
        return fc11.j0(x8a0Var, new zrk(handler, (byte) 1));
    }

    public Single l(Intent intent, th61 th61Var) {
        ru9 ru9Var = (ru9) this.b;
        Maybe maybeFilter = Single.just(Boolean.valueOf(((s54) ru9Var.c).a())).filter(yj20.i);
        dg90 dg90Var = new dg90(ru9Var, (byte) 10);
        maybeFilter.getClass();
        MaybeFlatMapCompletable maybeFlatMapCompletable = new MaybeFlatMapCompletable(maybeFilter, dg90Var);
        crn0 crn0Var = crn0.a;
        return maybeFlatMapCompletable.x(crn0Var).onErrorReturnItem(crn0Var);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new rjj0((String) obj, (Map) obj2, (Set) obj3, (xu00) this.b);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new ci0(((yue0) this.b).b.subscribe(new qc6(observableEmitter, (byte) 1)), (byte) 5));
    }

    public void v(Object obj) {
        MessageInputView.A((MessageInputView) this.b, (String) ((spq0) obj).h());
    }

    public /* synthetic */ upa0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public upa0(yfu yfuVar, pob pobVar) {
        this.a = (byte) 5;
        this.b = yfuVar;
    }

    public Object apply(Object obj, Object obj2) {
        return ((i1n0) this.b).d.a(((l5e0) obj).b, (des) obj2);
    }
}
