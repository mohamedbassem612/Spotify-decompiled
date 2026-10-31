package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.encoders.EncodingException;
import com.google.protobuf.StringValue;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.identity.proto.v3.Identity;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.polls.proto.GetPollsForEntityRequest;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.tome.pageactivity.PageActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yqu0 implements Function, l381 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public yqu0(y441 y441Var, y11 y11Var, float f, mtx0 mtx0Var, bf4 bf4Var, gw70 gw70Var) {
        this.a = (byte) 24;
        this.c = y11Var;
        this.b = mtx0Var;
        gw70Var.f(f < 120.0f ? "https://ai-playlist.spotifycdn.com/images/v1/logo-small-android.png" : "https://ai-playlist.spotifycdn.com/images/v1/logo-big-android.png").k((ImageView) y441Var.c, (ird1) null);
        ((TextView) y441Var.d).setText(bf4Var.b() ? 2131960605 : 2131960604);
        i8h1 i8h1Var = mtx0Var.a;
        x6h1 x6h1VarC = mtx0Var.b.b.c();
        x6h1VarC.i.add(new a7h1("onboarding_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
        ((EncoreButton) y441Var.b).setOnClickListener(new hid0(this, (byte) 17));
    }

    public static final String d(s1x0 s1x0Var, boolean z, boolean z2, Function0 function0) {
        if (!z && (!s1x0Var.h || !z2)) {
            return null;
        }
        String value = ((StringValue) function0.invoke()).getValue();
        value.getClass();
        if (ihc1.y0(value)) {
            return null;
        }
        return value;
    }

    public static boolean j(String str, String str2) {
        if (!str.trim().startsWith(str2)) {
            return false;
        }
        String[] strArrSplit = str.split("=", 2);
        return strArrSplit.length == 2 && strArrSplit[1].length() > 1;
    }

    public boolean a(p6a1 p6a1Var, float f) {
        boolean z = true;
        if (!((p6a1) this.c).a) {
            for (int i = 0; i < 9; i++) {
                float f2 = p6a1Var.h[i];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    ((p6a1) this.c).h[i] = f3;
                } else {
                    ((p6a1) this.c).h[i] = 0.0f;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = ((p6a1) this.c).h;
            float f4 = (p6a1Var.h[i2] * f) + fArr[i2];
            fArr[i2] = f4;
            if (Math.abs(f4) < 1.0E-4f) {
                ((p6a1) this.c).h[i2] = 0.0f;
            } else {
                z = false;
            }
        }
        if (z) {
            ((znw0) this.b).k((p6a1) this.c);
        }
        return false;
    }

    public Object apply(Object obj) {
        int i;
        Identity.UserProfile userProfile;
        Object next;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                bru0 bru0Var = (bru0) this.c;
                String str2 = (String) this.b;
                rsc0 rsc0Var = bru0Var.c;
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                vwu0VarR.A();
                vwu0VarR.x();
                vwu0VarR.u(ArtistDecorationPolicy.newBuilder().setName(true).build());
                dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
                dgu0VarP.q(AlbumDecorationPolicy.newBuilder().setCovers(true).build());
                vwu0VarR.r(dgu0VarP.build());
                vwu0VarR.D(TrackDecorationPolicy.newBuilder().setName(true).setLink(true).setPreviewId(true).build());
                hru0VarS.y(vwu0VarR.build());
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
                playlistRequestDecorationPolicyBuild.getClass();
                return yoi1.i(rsc0Var.k(str, new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, Collections.singleton(grc0.a), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474)), o6x.a).map(new aru0(str, bru0Var, str2));
            case 1:
                return ((e0v0) ((aru0) this.c).b).a((String) this.b).map(a020.c1).map(new qkn0((n331) obj, (byte) 24));
            case 4:
                ClientPollResponse clientPollResponse = (ClientPollResponse) obj;
                String str3 = (String) this.b;
                if (clientPollResponse.q() && u890.j(clientPollResponse.o().getEntityUri(), str3)) {
                    Observable observableJust = Observable.just(clientPollResponse);
                    observableJust.getClass();
                    return observableJust;
                }
                yeu0 yeu0Var = (yeu0) this.c;
                uo40 uo40VarN = GetPollsForEntityRequest.n();
                uo40VarN.n(str3);
                GetPollsForEntityRequest getPollsForEntityRequestBuild = uo40VarN.build();
                ncv0 ncv0Var = (ncv0) yeu0Var.b;
                getPollsForEntityRequestBuild.getClass();
                return ncv0Var.a(getPollsForEntityRequestBuild).map(d710.d1).doOnSuccess(new ocv0(yeu0Var, (byte) 0)).toObservable();
            case 8:
                Boolean bool = (Boolean) obj;
                ywv0 ywv0Var = (ywv0) this.c;
                return new CompletableFromAction(new lig(bool, ywv0Var, wdy0.a[((oe4) ywv0Var.b).a().ordinal()] == 1 ? zwv0.b : zwv0.a, (tv80) this.b, (byte) 4)).s((Scheduler) ywv0Var.i);
            case 10:
                mzr0 mzr0Var = (mzr0) this.c;
                gzv0 gzv0Var = (gzv0) this.b;
                if (!gzv0Var.h) {
                    boolean z = gzv0Var.g;
                    if (z) {
                        i = 2131951965;
                    } else {
                        if (z) {
                            eg.o();
                            return null;
                        }
                        i = 2131960397;
                    }
                    kt91 kt91Var = (kt91) mzr0Var.c;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return rih1.a;
            case 16:
                SingleSubject singleSubject = new SingleSubject();
                lis lisVar = (lis) this.c;
                lls0 lls0Var = (lls0) this.b;
                i8h1 i8h1Var = lisVar.a;
                tdl0 tdl0Var = lisVar.c;
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("result_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("save_failed_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = tdl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                iyw0 iyw0Var = new iyw0(lisVar, singleSubject, (byte) 2);
                iyw0 iyw0Var2 = new iyw0(lisVar, singleSubject, (byte) 3);
                dg30 dg30Var = (dg30) lls0Var.c;
                mw40 mw40VarT = yoi1.T(dg30Var, dg30Var.getString(2131955343), dg30Var.getString(2131955342));
                mw40VarT.a = dg30Var.getString(2131955341);
                mw40VarT.c = iyw0Var;
                mw40VarT.b = dg30Var.getString(2131955340);
                mw40VarT.d = iyw0Var2;
                mw40VarT.b().b();
                return singleSubject;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                sy21 sy21Var = (sy21) obj;
                if (!sy21Var.a.Q0) {
                    sy21Var = null;
                }
                if (sy21Var == null || (userProfile = (Identity.UserProfile) sy21Var.b) == null) {
                    return t2x0.a;
                }
                gdx0 gdx0Var = (gdx0) this.c;
                s1x0 s1x0Var = (s1x0) this.b;
                String value = userProfile.s().getValue();
                Iterator it = userProfile.p().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Identity.Image image = (Identity.Image) next;
                        int iO = image.o() * image.n();
                        do {
                            Object next2 = it.next();
                            Identity.Image image2 = (Identity.Image) next2;
                            int iO2 = image2.o() * image2.n();
                            if (iO < iO2) {
                                next = next2;
                                iO = iO2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Identity.Image image3 = (Identity.Image) next;
                String url = image3 != null ? image3.getUrl() : null;
                boolean value2 = userProfile.o().getValue();
                th4 th4Var = gdx0Var.a;
                String strD = d(s1x0Var, th4Var.i(), th4Var.e(), new d2x0(userProfile, (byte) 0));
                String strD2 = d(s1x0Var, th4Var.h(), th4Var.d(), new d2x0(userProfile, (byte) 1));
                String value3 = userProfile.u().getValue();
                value3.getClass();
                return new s2x0(value, url, strD, strD2, !ihc1.y0(value3) ? value3 : null, userProfile.n().getValue(), value2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Set set = s4b1.f;
                Intent intent = (Intent) this.c;
                s4b1 s4b1VarX = uic.x(intent.getDataString());
                String strS = s4b1VarX.s();
                strS.getClass();
                String strZ = uic.C(strS, (String) null).z();
                strZ.getClass();
                String str4 = ((th61) this.b).a;
                return new hrn0(x3x0.class, new y3x0(16, strZ, str4, intent.getBooleanExtra("view_as_visitor", false), ((Boolean) obj).booleanValue() && !u890.j(str4, s4b1VarX.s())), a6w0.a);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                v4x0 v4x0Var = (v4x0) obj;
                o3x0 o3x0Var = (o3x0) this.c;
                int i2 = v4x0Var.e;
                tv80 tv80VarB = v4x0Var.f;
                if (tv80VarB == null) {
                    int iC = l1d.C(i2);
                    if (iC == 0) {
                        tv80VarB = o3x0Var.b(true);
                    } else if (iC == 1) {
                        tv80VarB = o3x0Var.b(false);
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i8h1 i8h1Var2 = o3x0Var.a;
                        x6h1 x6h1VarC3 = o3x0Var.c.a.c();
                        x6h1VarC3.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("follow_back_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC4.a();
                        String str5 = o3x0Var.b;
                        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                        if (str5 == null) {
                            str5 = "";
                        }
                        tv80VarB = i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str5)), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                boolean z2 = i2 != 2;
                zsc zscVar = (zsc) this.b;
                String str6 = v4x0Var.d;
                str6.getClass();
                return zscVar.J(str6, z2).x(new f6x0(i2, tv80VarB)).onErrorReturn(r5x0.b).toObservable();
            case 22:
                Map map = (Map) obj;
                tzr0 tzr0Var = (tzr0) this.c;
                j8x0 j8x0Var = (j8x0) this.b;
                List<obx0> list = j8x0Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (obx0 obx0VarA : list) {
                    if (obx0VarA instanceof obx0) {
                        obx0 obx0Var = obx0VarA;
                        q730 q730Var = (q730) map.get(obx0Var.b);
                        if (q730Var != null) {
                            int iMax = Math.max(q730Var.a ? 1 : 0, q730Var.c);
                            obx0VarA = obx0.a(obx0Var, (nbx0) null, (String) null, ((Activity) tzr0Var.b).getResources().getQuantityString(2131820864, iMax, Integer.valueOf(iMax)), (String) null, q730Var, (Integer) null, 0, 4055);
                        } else {
                            obx0VarA = obx0Var;
                        }
                    }
                    arrayList.add(obx0VarA);
                }
                return j8x0.a(j8x0Var, 0, arrayList, (String) null, false, false, 0, 0, 125);
            default:
                if (!((Boolean) obj).booleanValue()) {
                    return crn0.a;
                }
                Activity activity = (Activity) ((b72) this.c).b;
                Bundle extras = ((Intent) this.b).getExtras();
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("spotify:internal:puffin-intro"));
                intent2.setClassName(activity.getApplicationContext(), PageActivity.class.getName());
                intent2.setFlags(536870912);
                if (extras != null) {
                    intent2.putExtras(extras);
                }
                return new drn0(intent2);
        }
    }

    public o3r b() {
        return (o3r) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r13.a(r14, r7) == r11) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p.hew r14, p.onm r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p.xxv0
            if (r0 == 0) goto L14
            r0 = r15
            p.xxv0 r0 = (p.xxv0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.xxv0 r0 = new p.xxv0
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r7.b
            int r0 = r7.d
            r9 = 3
            r1 = 2
            r2 = 1
            r10 = 0
            p.d9n r11 = p.d9n.a
            if (r0 == 0) goto L41
            if (r0 == r2) goto L3b
            if (r0 == r1) goto L37
            if (r0 != r9) goto L31
            p.hm5.M(r15)
            goto Lb7
        L31:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r10
        L37:
            p.hm5.M(r15)
            goto L9c
        L3b:
            p.wkt r14 = r7.a
            p.hm5.M(r15)
            goto L7b
        L41:
            p.hm5.M(r15)
            p.wkt r15 = r14.b
            android.net.Uri r0 = r14.d
            java.lang.Object r3 = r13.b
            p.gqg r3 = (p.gqg) r3
            p.o571 r4 = r15.a()
            p.c380 r5 = r15.g()
            java.util.List r5 = p.o7h.l1(r5)
            p.vmt r3 = p.gqg.b(r3, r4, r5)
            p.u771 r4 = r14.a
            p.t771 r4 = r4.a
            p.wa71 r4 = r4.a
            p.ant r14 = r14.c
            if (r0 == 0) goto L6c
            p.bnt r5 = new p.bnt
            r5.<init>(r0)
            goto L6d
        L6c:
            r5 = r10
        L6d:
            r7.a = r15
            r7.d = r2
            java.lang.Object r14 = r3.b(r4, r14, r5, r10)
            if (r14 != r11) goto L78
            goto Lb6
        L78:
            r12 = r15
            r15 = r14
            r14 = r12
        L7b:
            p.p371 r15 = (p.p371) r15
            p.sg0 r3 = new p.sg0
            r0 = 17
            r3.<init>(r2, r10, r0)
            p.sg0 r4 = new p.sg0
            r0 = 19
            r4.<init>(r2, r10, r0)
            r7.a = r10
            r7.d = r1
            r5 = 0
            r6 = 0
            r8 = 56
            r1 = r14
            r2 = r15
            java.lang.Object r15 = p.fq7.K(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r15 != r11) goto L9c
            goto Lb6
        L9c:
            p.umt r15 = (p.umt) r15
            java.lang.Object r13 = r13.c
            p.wh71 r13 = (p.wh71) r13
            p.clw0 r14 = new p.clw0
            p.zmt r0 = new p.zmt
            r0.<init>(r15)
            r14.<init>(r0)
            r7.a = r10
            r7.d = r9
            java.lang.Object r13 = r13.a(r14, r7)
            if (r13 != r11) goto Lb7
        Lb6:
            return r11
        Lb7:
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yqu0.c(p.hew, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws EncodingException {
        HashMap map = (HashMap) this.c;
        viy0 viy0Var = new viy0(byteArrayOutputStream, map, (HashMap) this.b);
        if (obj == null) {
            return;
        }
        ifp0 ifp0Var = (ifp0) map.get(obj.getClass());
        if (ifp0Var != null) {
            ifp0Var.a(obj, viy0Var);
            return;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public List f() {
        return (ArrayList) this.c;
    }

    public void g(p6a1 p6a1Var) {
        this.c = p6a1Var;
    }

    public boolean h() {
        for (int i = 8; i >= 0; i--) {
            float f = ((p6a1) this.c).h[i];
            if (f > 0.0f) {
                return false;
            }
            if (f < 0.0f) {
                return true;
            }
        }
        return false;
    }

    public boolean i(p6a1 p6a1Var) {
        for (int i = 8; i >= 0; i--) {
            float f = p6a1Var.h[i];
            float f2 = ((p6a1) this.c).h[i];
            if (f2 != f) {
                return f2 < f;
            }
        }
        return false;
    }

    public void k() {
        Arrays.fill(((p6a1) this.c).h, 0.0f);
    }

    public void l() {
        this.b = null;
    }

    public boolean t(Object obj) {
        String string;
        Boolean boolD1;
        qxc0 qxc0Var = (qxc0) obj;
        Map map = qxc0Var.X;
        Set set = h4d0.a;
        String str = (String) map.get("generation_status");
        if (str == null || (string = ihc1.e1(str).toString()) == null) {
            string = "";
        }
        h4d0 h4d0VarU = qyo1.u(string);
        if (!qxc0Var.h && !h4d0VarU.b() && qxc0Var.S0 > 0 && !h4d0.a.contains(h4d0VarU)) {
            String str2 = (String) map.get("is_personalized_playlist");
            if (((str2 == null || (boolD1 = ihc1.d1(str2)) == null) ? false : boolD1.booleanValue()) && !((xyl1) ((z2y0) this.b).c.c).a(map)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 14:
                String str = "[ ";
                if (((p6a1) this.c) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((p6a1) this.c).h[i] + " ";
                    }
                }
                StringBuilder sbG = dv20.g(str, "] ");
                sbG.append((p6a1) this.c);
                return sbG.toString();
            default:
                return super.toString();
        }
    }

    public yqu0(String str, yeu0 yeu0Var) {
        this.a = (byte) 4;
        this.b = str;
        this.c = yeu0Var;
    }

    public yqu0(dma1 dma1Var) {
        this.a = (byte) 25;
        this.c = dma1Var;
    }

    public yqu0() {
        this.a = (byte) 5;
        bpb1 bpb1VarB = gio1.b(new aev0((String) null, 3));
        this.c = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
    }

    public yqu0(ywp ywpVar) {
        this.a = (byte) 12;
        this.c = ywpVar;
        this.b = new h7l0((byte) 22);
    }

    public yqu0(jxp jxpVar) {
        this.a = (byte) 6;
        this.c = jxpVar;
        this.b = new brl0((byte) 5);
    }

    public yqu0(i8h1 i8h1Var) {
        this.a = (byte) 2;
        this.c = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.b = new tol0("see_all");
    }

    public /* synthetic */ yqu0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public yqu0(z2y0 z2y0Var) {
        this.a = (byte) 26;
        this.b = z2y0Var;
        this.c = z2y0Var.d;
    }

    public yqu0(znw0 znw0Var) {
        this.a = (byte) 14;
        this.b = znw0Var;
    }
}
