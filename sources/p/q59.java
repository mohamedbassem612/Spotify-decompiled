package p;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.DeferrableSurface;
import com.spotify.addonconsideration.v1.BulletedListItem;
import com.spotify.addonconsideration.v1.EmphasizedIconListItem;
import com.spotify.addonconsideration.v1.GetAddonConsiderationRequest;
import com.spotify.addonconsideration.v1.GetAddonConsiderationResponse;
import com.spotify.addonconsideration.v1.ShowcaseDescriptionList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Consumer;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public class q59 implements dkz, Function, k1q0, nxa, ix30 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public q59(Set set, luk lukVar) {
        this.a = (byte) 12;
        this.b = lukVar;
        Set set2 = set;
        int iS = zno1.s(q7h.U(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : set2) {
            linkedHashMap.put(((iya) obj).a, obj);
        }
        this.c = linkedHashMap;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((iya) it.next()).a);
        }
    }

    public void a() {
        c59 c59Var = (c59) ((v59) this.b).a.d.a;
        Consumer consumer = (Consumer) ((s59) this.c).b;
        if (consumer != null) {
            consumer.accept(c59Var);
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                return kc9.x((kc9) obj2, (String) this.c, (y0i0) obj);
            case 3:
                pg9 pg9Var = (pg9) obj;
                pg9Var.getClass();
                fi9 fi9Var = (fi9) this.c;
                ((af9) obj2).getClass();
                return new xe9(pg9Var.a, fi9Var, pg9Var.b, pg9Var.c, pg9Var.d);
            case 9:
                nba nbaVar = (nba) obj2;
                return nbaVar.d.b((List) obj, (String) this.c, nbaVar.a.b.g);
            default:
                g0b g0bVar = (g0b) obj2;
                return (Single) ((py21) obj).b(new rs7((Object) g0bVar, (byte) 11), new kd8((List) this.c, g0bVar, (byte) 18));
        }
    }

    public int b(ArrayList arrayList, g661 g661Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).captureBurst(arrayList, new b1d(g661Var, captureCallback), ((s2d) this.c).a);
    }

    public Set c(yf yfVar) {
        iya iyaVar = (iya) ((LinkedHashMap) this.c).get(yfVar);
        Integer num = iyaVar != null ? (Integer) iyaVar.b.invoke((luk) this.b) : null;
        if (num == null) {
            Logger.d("Bitmask properties ---> %s.%s is not registered", new Object[]{"android-share", (String) yfVar.a});
            return w7x.a;
        }
        List list = ((hya) yfVar.b).a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Integer num2 = ((o571) obj).b;
            mmr0 mmr0Var = num2 != null ? new mmr0(Integer.valueOf(num2.intValue()), obj) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        Map mapT = sqg0.T(arrayList);
        int iIntValue = num.intValue();
        Set setEntrySet = mapT.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (((1 << ((Number) ((Map.Entry) obj2).getKey()).intValue()) & iIntValue) != 0) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Map.Entry) it.next()).getValue());
        }
        return linkedHashSet;
    }

    public void d() {
        c59 c59Var = (c59) ((v59) this.b).a.c.a;
        Consumer consumer = (Consumer) ((s59) this.c).b;
        if (consumer != null) {
            consumer.accept(c59Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.spotify.addonconsideration.v1.GetAddonConsiderationRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.spotify.addonconsideration.v1.GetAddonConsiderationRequest] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [p.l02] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.l02] */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    public Object e(String str, String str2, String str3, boolean z, onm onmVar) throws HttpException {
        av9 av9Var;
        ?? r5;
        ?? r4;
        ?? r2;
        ?? r1;
        ?? r6;
        ?? r3;
        ?? r7;
        ?? r8;
        String str4;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        GetAddonConsiderationResponse getAddonConsiderationResponse;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r20;
        z6x z6xVar;
        ?? r21;
        String str5;
        String str6;
        ?? r22;
        String str7;
        String str8;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        ?? r23 = z;
        ?? r24 = (l02) this.b;
        ?? r25 = (l02) this.c;
        if (onmVar instanceof av9) {
            av9Var = (av9) onmVar;
            int i = av9Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                av9Var.h = i - Integer.MIN_VALUE;
            } else {
                av9Var = new av9(this, onmVar);
            }
        } else {
            av9Var = new av9(this, onmVar);
        }
        Object objA = av9Var.f;
        ?? r26 = av9Var.h;
        d9n d9nVar = d9n.a;
        try {
            if (r26 == 0) {
                hm5.M(objA);
                nk40 nk40VarN = GetAddonConsiderationRequest.n();
                nk40VarN.n(str9);
                nk40VarN.q(str10);
                nk40VarN.r(str11);
                GetAddonConsiderationRequest getAddonConsiderationRequestBuild = nk40VarN.build();
                if (r23 != 0) {
                    getAddonConsiderationRequestBuild.getClass();
                    av9Var.a = str9;
                    av9Var.b = str10;
                    av9Var.c = str11;
                    av9Var.d = getAddonConsiderationRequestBuild;
                    av9Var.e = r23;
                    av9Var.h = 1;
                    objA = r25.a(getAddonConsiderationRequestBuild, av9Var);
                    if (objA == d9nVar) {
                        str5 = str9;
                        str6 = str10;
                        r21 = r23;
                    }
                    str5 = str9;
                    str6 = str10;
                    r21 = r23;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                    r18 = str5;
                    r19 = str6;
                    r17 = r21;
                } else {
                    getAddonConsiderationRequestBuild.getClass();
                    av9Var.a = str9;
                    av9Var.b = str10;
                    av9Var.c = str11;
                    av9Var.d = getAddonConsiderationRequestBuild;
                    av9Var.e = r23;
                    av9Var.h = 2;
                    objA = r24.a(getAddonConsiderationRequestBuild, av9Var);
                    if (objA == d9nVar) {
                        str7 = str9;
                        str8 = str10;
                        r22 = r23;
                    }
                    str7 = str9;
                    str8 = str10;
                    r22 = r23;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                    r18 = str7;
                    r19 = str8;
                    r17 = r22;
                }
                r3 = z;
                r8 = getAddonConsiderationRequest;
                r7 = str;
                r6 = str;
                r3 = z;
                r8 = getAddonConsiderationRequest;
                r7 = str;
                r6 = str;
                return d9nVar;
            }
            try {
                if (r26 == 1) {
                    boolean z2 = av9Var.e;
                    GetAddonConsiderationRequest getAddonConsiderationRequest = av9Var.d;
                    str11 = av9Var.c;
                    String str12 = av9Var.b;
                    String str13 = av9Var.a;
                    hm5.M(objA);
                    r21 = z2;
                    str5 = str13;
                    str6 = str12;
                    str5 = str9;
                    str6 = str10;
                    r21 = r23;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                    r18 = str5;
                    r19 = str6;
                    r17 = r21;
                } else if (r26 == 2) {
                    boolean z3 = av9Var.e;
                    GetAddonConsiderationRequest getAddonConsiderationRequest2 = av9Var.d;
                    str11 = av9Var.c;
                    String str14 = av9Var.b;
                    String str15 = av9Var.a;
                    hm5.M(objA);
                    r22 = z3;
                    str7 = str15;
                    str8 = str14;
                    str7 = str9;
                    str8 = str10;
                    r22 = r23;
                    getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                    r18 = str7;
                    r19 = str8;
                    r17 = r22;
                } else {
                    if (r26 == 3) {
                        boolean z4 = av9Var.e;
                        GetAddonConsiderationRequest getAddonConsiderationRequest3 = av9Var.d;
                        str11 = av9Var.c;
                        String str16 = av9Var.b;
                        String str17 = av9Var.a;
                        hm5.M(objA);
                        if (r3 != 0) {
                            r8.getClass();
                            av9Var.a = r6;
                            av9Var.b = r7;
                            av9Var.c = str11;
                            av9Var.d = null;
                            av9Var.e = r3;
                            av9Var.h = 4;
                            objA = r25.a(r8, av9Var);
                            if (objA != d9nVar) {
                                r3 = z4;
                                r8 = getAddonConsiderationRequest3;
                                r7 = str16;
                                r6 = str17;
                                str4 = str11;
                                r11 = r7;
                                r12 = r6;
                                r13 = r3;
                                getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                                r16 = r13;
                                r15 = r11;
                                r14 = r12;
                                ?? r27 = r14;
                                r17 = r16;
                                r18 = r27;
                                ?? r28 = r15;
                                str11 = str4;
                                r19 = r28;
                            }
                        } else {
                            r8.getClass();
                            av9Var.a = r6;
                            av9Var.b = r7;
                            av9Var.c = str11;
                            av9Var.d = null;
                            av9Var.e = r3;
                            av9Var.h = 5;
                            objA = r24.a(r8, av9Var);
                            if (objA != d9nVar) {
                                r3 = z4;
                                r8 = getAddonConsiderationRequest3;
                                r7 = str16;
                                r6 = str17;
                                str4 = str11;
                                r9 = r7;
                                r10 = r6;
                                r20 = r3;
                                getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                                r16 = r20;
                                r15 = r9;
                                r14 = r10;
                                ?? r29 = r14;
                                r17 = r16;
                                r18 = r29;
                                ?? r210 = r15;
                                str11 = str4;
                                r19 = r210;
                            }
                        }
                        r3 = z4;
                        r8 = getAddonConsiderationRequest3;
                        r7 = str16;
                        r6 = str17;
                        r3 = z4;
                        r8 = getAddonConsiderationRequest3;
                        r7 = str16;
                        r6 = str17;
                        return d9nVar;
                    }
                    if (r26 == 4) {
                        boolean z5 = av9Var.e;
                        str4 = av9Var.c;
                        String str18 = av9Var.b;
                        String str19 = av9Var.a;
                        hm5.M(objA);
                        r13 = z5;
                        r11 = str18;
                        r12 = str19;
                        getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                        r16 = r13;
                        r15 = r11;
                        r14 = r12;
                        ?? r211 = r14;
                        r17 = r16;
                        r18 = r211;
                        ?? r212 = r15;
                        str11 = str4;
                        r19 = r212;
                    } else {
                        if (r26 != 5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z6 = av9Var.e;
                        str4 = av9Var.c;
                        String str20 = av9Var.b;
                        String str21 = av9Var.a;
                        hm5.M(objA);
                        r20 = z6;
                        r9 = str20;
                        r10 = str21;
                        getAddonConsiderationResponse = (GetAddonConsiderationResponse) objA;
                        r16 = r20;
                        r15 = r9;
                        r14 = r10;
                        ?? r213 = r14;
                        r17 = r16;
                        r18 = r213;
                        ?? r214 = r15;
                        str11 = str4;
                        r19 = r214;
                    }
                }
            } catch (HttpException e) {
                e = e;
                r4 = str9;
                r1 = r26;
                r5 = str10;
                r2 = r23;
                if (e.a != 503) {
                    throw e;
                }
                av9Var.a = r1;
                av9Var.b = r2;
                av9Var.c = str11;
                av9Var.d = r5;
                av9Var.e = r4;
                av9Var.h = 3;
                if (hap1.i(200L, av9Var) != d9nVar) {
                    ?? r215 = r5;
                    r6 = r1;
                    r3 = r4;
                    r7 = r2;
                    r8 = r215;
                }
                r3 = z4;
                r8 = getAddonConsiderationRequest3;
                r7 = str16;
                r6 = str17;
                r3 = z4;
                r8 = getAddonConsiderationRequest3;
                r7 = str16;
                r6 = str17;
                return d9nVar;
            }
        } catch (HttpException e2) {
            e = e2;
            r1 = str9;
            r2 = str10;
            r4 = r23;
            r5 = r26;
        }
        ?? r30 = r18;
        ?? r31 = r19;
        String str22 = str11;
        ?? r32 = r17;
        int iN = getAddonConsiderationResponse.n();
        int i2 = iN == 0 ? -1 : zu9.b[l1d.C(iN)];
        if (i2 != 1) {
            if (i2 == 2) {
                return new lf1();
            }
            eg.o();
            return null;
        }
        String title = getAddonConsiderationResponse.o().q().getTitle();
        String strU = getAddonConsiderationResponse.o().q().u();
        String str23 = strU == null ? "#FFFFFF" : strU;
        String strS = getAddonConsiderationResponse.o().q().s();
        String strT = getAddonConsiderationResponse.o().q().t();
        String str24 = strT == null ? "#FFFFFF" : strT;
        String description = getAddonConsiderationResponse.o().q().getDescription();
        String strN = getAddonConsiderationResponse.o().q().n();
        String strR = getAddonConsiderationResponse.o().q().r();
        String str25 = strR == null ? "" : strR;
        String strQ = getAddonConsiderationResponse.o().q().q();
        qw50 qw50Var = new qw50(title, str23, strS, str24, description, strN, new o10(getAddonConsiderationResponse.o().q().o().p(), getAddonConsiderationResponse.o().q().o().getUri(), getAddonConsiderationResponse.o().q().o().n()), str25, strQ == null ? "" : strQ);
        h290<ShowcaseDescriptionList> h290VarO = getAddonConsiderationResponse.o().o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (ShowcaseDescriptionList showcaseDescriptionList : h290VarO) {
            String description2 = showcaseDescriptionList.getDescription();
            int iP = showcaseDescriptionList.p();
            int i3 = iP == 0 ? -1 : zu9.a[l1d.C(iP)];
            if (i3 == 1) {
                List itemsList = showcaseDescriptionList.n().getItemsList();
                z6x arrayList2 = new ArrayList(q7h.U(itemsList, 10));
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new avc0(27, null, null, ((BulletedListItem) it.next()).n(), null));
                }
                z6xVar = arrayList2;
            } else if (i3 == 2) {
                List<EmphasizedIconListItem> itemsList2 = showcaseDescriptionList.o().getItemsList();
                z6x arrayList3 = new ArrayList(q7h.U(itemsList2, 10));
                for (EmphasizedIconListItem emphasizedIconListItem : itemsList2) {
                    arrayList3.add(new avc0(16, emphasizedIconListItem.n(), emphasizedIconListItem.o(), emphasizedIconListItem.getTitle(), emphasizedIconListItem.p()));
                }
                z6xVar = arrayList3;
            } else {
                if (i3 != 3) {
                    eg.o();
                    return null;
                }
                z6xVar = z6x.a;
            }
            int iP2 = showcaseDescriptionList.p();
            arrayList.add(new umc0(description2, z6xVar, (iP2 == 0 ? -1 : zu9.a[l1d.C(iP2)]) == 2 ? 2 : 1));
        }
        return new lf1(qw50Var, arrayList, getAddonConsiderationResponse.o().p(), r30, r31, str22, r32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, onm onmVar) {
        xda xdaVar;
        if (onmVar instanceof xda) {
            xdaVar = (xda) onmVar;
            int i = xdaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xdaVar.c = i - Integer.MIN_VALUE;
            } else {
                xdaVar = new xda(this, onmVar);
            }
        } else {
            xdaVar = new xda(this, onmVar);
        }
        Object objF = xdaVar.a;
        int i2 = xdaVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.b;
            trc0 trc0VarA = trc0.a((trc0) this.c, (PlaylistRequestDecorationPolicy) null, (g3d0) null, (Set) null, (mqz0) null, 383);
            xdaVar.c = 1;
            objF = rsc0Var.f(str, trc0VarA, xdaVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        return ((py21) objF).a(yda.b);
    }

    public LinkedHashSet g() {
        LinkedHashSet linkedHashSet;
        synchronized (this.b) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.c).values());
        }
        return linkedHashSet;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r1 == r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.String r26, p.onm r27, boolean r28) throws retrofit2.HttpException {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q59.h(java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public n8d0 i(tqh0 tqh0Var) {
        Uri uri;
        byte[] bArr;
        cab cabVar = (cab) this.c;
        if (cabVar != null && (((uri = (Uri) cabVar.c) != null && uri.equals(tqh0Var.n)) || ((bArr = (byte[]) cabVar.b) != null && Arrays.equals(bArr, tqh0Var.k)))) {
            n8d0 n8d0Var = (n8d0) ((cab) this.c).d;
            n8d0Var.getClass();
            return n8d0Var;
        }
        n8d0 n8d0VarI = ((nxa) this.b).i(tqh0Var);
        if (n8d0VarI == null) {
            return null;
        }
        this.c = new cab(tqh0Var, n8d0VarI);
        return n8d0VarI;
    }

    public pfb j() {
        return (pfb) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(int i, Set set, onm onmVar) {
        sn9 sn9Var;
        int i2;
        if (onmVar instanceof sn9) {
            sn9Var = (sn9) onmVar;
            int i3 = sn9Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sn9Var.e = i3 - Integer.MIN_VALUE;
            } else {
                sn9Var = new sn9(this, onmVar);
            }
        } else {
            sn9Var = new sn9(this, onmVar);
        }
        Object objA = sn9Var.c;
        int i4 = sn9Var.e;
        d9n d9nVar = d9n.a;
        if (i4 == 0) {
            hm5.M(objA);
            gq9 gq9Var = (gq9) this.b;
            sn9Var.b = set;
            sn9Var.a = i;
            sn9Var.e = 1;
            objA = gq9Var.a(sn9Var);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i4 == 1) {
            i = sn9Var.a;
            set = sn9Var.b;
            hm5.M(objA);
        } else {
            if (i4 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = sn9Var.a;
            Set set2 = sn9Var.b;
            hm5.M(objA);
        }
        return o7h.d1((Iterable) objA, i2);
        List list = ((jq9) objA).a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return z6x.a;
        }
        sn9Var.b = null;
        sn9Var.a = i;
        sn9Var.e = 2;
        objA = s(arrayList, sn9Var);
        if (objA != d9nVar) {
            i2 = i;
            return o7h.d1((Iterable) objA, i2);
        }
        return d9nVar;
    }

    public rl1 l() {
        return (rl1) this.b;
    }

    public n8d0 m(Uri uri) {
        Uri uri2;
        cab cabVar = (cab) this.c;
        if (cabVar == null || (uri2 = (Uri) cabVar.c) == null || !uri2.equals(uri)) {
            n8d0 n8d0VarM = ((nxa) this.b).m(uri);
            this.c = new cab(uri, n8d0VarM);
            return n8d0VarM;
        }
        n8d0 n8d0Var = (n8d0) ((cab) this.c).d;
        n8d0Var.getClass();
        return n8d0Var;
    }

    public void n(e1d e1dVar) {
        synchronized (this.b) {
            try {
                e1dVar.getClass();
                for (String str : new LinkedHashSet(e1dVar.f)) {
                    j2h1.o("CameraRepository");
                    ((LinkedHashMap) this.c).put(str, e1dVar.a(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(onm onmVar) {
        gdc gdcVar;
        if (onmVar instanceof gdc) {
            gdcVar = (gdc) onmVar;
            int i = gdcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdcVar.c = i - Integer.MIN_VALUE;
            } else {
                gdcVar = new gdc(this, onmVar);
            }
        } else {
            gdcVar = new gdc(this, onmVar);
        }
        Object objJ = gdcVar.a;
        int i2 = gdcVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFromCallable = Single.fromCallable(new sra((nrb1) this.c, (byte) 25));
            gdcVar.c = 1;
            objJ = fc11.j(singleFromCallable, gdcVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        List list = (List) objJ;
        if (list.isEmpty()) {
            return null;
        }
        Context context = (Context) this.b;
        List list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list2) {
            linkedHashMap.put(((m0d) obj).a, obj);
        }
        return new bus0(list, mpi1.a(context, linkedHashMap).a, 2);
    }

    public void onFailure(Throwable th) {
        bb61 bb61Var;
        boolean z = th instanceof DeferrableSurface.SurfaceClosedException;
        p1d p1dVar = (p1d) this.c;
        if (!z) {
            if (th instanceof CancellationException) {
                p1dVar.t("Unable to configure camera cancelled");
                return;
            }
            if (p1dVar.h1 == 9) {
                ((p1d) this.c).E(9, new ky8(4, th), true);
            }
            ((p1d) this.c).toString();
            j2h1.q("Camera2CameraImpl");
            p1d p1dVar2 = (p1d) this.c;
            if (p1dVar2.Y == ((iod) this.b)) {
                p1dVar2.D();
                return;
            }
            return;
        }
        j2t j2tVar = ((DeferrableSurface.SurfaceClosedException) th).a;
        Iterator it = p1dVar.a.r().iterator();
        do {
            if (!it.hasNext()) {
                bb61Var = null;
                break;
            }
            bb61Var = (bb61) it.next();
        } while (!bb61Var.b().contains(j2tVar));
        if (bb61Var != null) {
            p1d p1dVar3 = (p1d) this.c;
            js50 js50VarA = x2g0.A();
            ya61 ya61Var = bb61Var.f;
            if (ya61Var != null) {
                new Throwable();
                p1dVar3.t("Posting surface closed");
                js50VarA.execute(new ny2(ya61Var, bb61Var, (byte) 24));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSuccess(Object obj) {
        p1d p1dVar = (p1d) this.c;
        if (p1dVar.P0.b == 2 && p1dVar.h1 == 9) {
            ((p1d) this.c).F(10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(onm onmVar) {
        dy9 dy9Var;
        if (onmVar instanceof dy9) {
            dy9Var = (dy9) onmVar;
            int i = dy9Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dy9Var.c = i - Integer.MIN_VALUE;
            } else {
                dy9Var = new dy9(this, onmVar);
            }
        } else {
            dy9Var = new dy9(this, onmVar);
        }
        Object objK = dy9Var.a;
        int i2 = dy9Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            ic9 ic9Var = (ic9) this.b;
            dy9Var.c = 1;
            objK = ic9Var.k(dy9Var);
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
        return new by9((d6b) objK);
    }

    public n8d0 q(byte[] bArr) {
        byte[] bArr2;
        cab cabVar = (cab) this.c;
        if (cabVar == null || (bArr2 = (byte[]) cabVar.b) == null || !Arrays.equals(bArr2, bArr)) {
            n8d0 n8d0VarQ = ((nxa) this.b).q(bArr);
            this.c = new cab(bArr, n8d0VarQ);
            return n8d0VarQ;
        }
        n8d0 n8d0Var = (n8d0) ((cab) this.c).d;
        n8d0Var.getClass();
        return n8d0Var;
    }

    public void r(t930 t930Var) {
        vi7 vi7Var = (vi7) this.c;
        dn81 dn81Var = (dn81) this.b;
        int i = t930Var.b;
        if (i == 0) {
            vi7Var.execute(new nx30(dn81Var, t930Var.a, (byte) 7));
        } else {
            vi7Var.execute(new qzc(dn81Var, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable s(ArrayList arrayList, onm onmVar) {
        tn9 tn9Var;
        ao9 ao9Var;
        String str;
        String str2;
        mq70 mq70Var;
        up70 up70VarA;
        if (onmVar instanceof tn9) {
            tn9Var = (tn9) onmVar;
            int i = tn9Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn9Var.d = i - Integer.MIN_VALUE;
            } else {
                tn9Var = new tn9(this, onmVar);
            }
        } else {
            tn9Var = new tn9(this, onmVar);
        }
        Object objJ = tn9Var.b;
        int i2 = tn9Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            ezc ezcVarG = yoi1.g(((uu00) this.c).b(new oi("byom", false, new s6(arrayList, (byte) 9))));
            s4 s4Var = new s4(2, (lnm) null, (byte) 21);
            tn9Var.a = arrayList;
            tn9Var.d = 1;
            objJ = b5p1.j(ezcVarG, s4Var, tn9Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = tn9Var.a;
            hm5.M(objJ);
        }
        uv00 uv00Var = (uv00) objJ;
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            jo70 jo70Var = uv00Var.a(jo70.class, str3).b;
            xkk1 xkk1Var = uv00Var.a(xkk1.class, str3).b;
            if (jo70Var == null || (str = jo70Var.a) == null) {
                ao9Var = null;
            } else {
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str2 = up70VarA.a.a) == null) {
                    str2 = "";
                }
                ao9Var = new ao9(str3, str, str2);
            }
            if (ao9Var != null) {
                arrayList2.add(ao9Var);
            }
        }
        return arrayList2;
    }

    public int t(CaptureRequest captureRequest, g661 g661Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).setRepeatingRequest(captureRequest, new b1d(g661Var, captureCallback), ((s2d) this.c).a);
    }

    public void u(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        mfm mfmVarA = ((i4q) this.b).a(new lik1(str2));
        rd3 rd3Var = (rd3) this.c;
        sd3 sd3Var = new sd3(false, nk51Var, 1);
        Observable map = rd3Var.a.b(new oi("prerelease_card_chat", false, new v1(str, (byte) 29))).filter(v560.e).map(new njp1(str, (byte) 2)).flatMap(new oj80(rd3Var, str, (byte) 24)).onErrorReturn(qz70.e).map(new g23(rd3Var, sd3Var, str, (byte) 6));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, map, yon1.d1(), new bjm(4, str, str2), tv80Var, 16);
    }

    public void v(ArrayList arrayList) {
        yjp0 yjp0Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((xjp0) arrayList.get(i)).a == 1) {
                try {
                    yjp0Var = new yjp0((xjp0) arrayList.get(i));
                } catch (wjp0 unused) {
                    yjp0Var = null;
                }
                this.c = yjp0Var;
            }
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        url1 prl1Var;
        nk80 nk80VarI = hsl1Var.a.i(519);
        Rect rectA = ((hoc) this.b).a(view.getWidth(), view.getResources());
        p811 p811Var = (p811) this.c;
        Rect rect = new Rect(rectA.left, nk80VarI.b, rectA.right, nk80VarI.d);
        p811Var.a = nk80.c(rect.left, rect.top, rect.right, rect.bottom);
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            prl1Var = new url1(hsl1Var);
        } else if (i >= 35) {
            prl1Var = new trl1(hsl1Var);
        } else if (i >= 34) {
            prl1Var = new srl1(hsl1Var);
        } else if (i >= 31) {
            prl1Var = new rrl1(hsl1Var);
        } else if (i >= 30) {
            prl1Var = new qrl1(hsl1Var);
        } else {
            prl1Var = i >= 29 ? new prl1(hsl1Var) : new nrl1(hsl1Var);
        }
        prl1Var.d(519, (nk80) p811Var.a);
        return prl1Var.b();
    }

    public /* synthetic */ q59(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public q59(i8h1 i8h1Var) {
        this.a = (byte) 14;
        this.b = i8h1Var;
        this.c = new otk0(new bqk0((byte) 11), (byte) 1);
    }

    public q59(String str, i8h1 i8h1Var) {
        this.a = (byte) 15;
        this.b = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.c = new rrk0(str, (byte) 7);
    }

    public q59(xrc0 xrc0Var) {
        this.a = (byte) 10;
        this.b = xrc0Var;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.l0();
        sku0VarP.H();
        sku0VarP.G();
        sku0VarP.U();
        hru0VarS.x(sku0VarP);
        this.c = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public q59(CameraCaptureSession cameraCaptureSession, s2d s2dVar) {
        this.a = (byte) 26;
        cameraCaptureSession.getClass();
        this.b = cameraCaptureSession;
        this.c = s2dVar;
    }

    public q59(nxa nxaVar) {
        this.a = (byte) 23;
        this.b = nxaVar;
    }

    public q59(byte b) {
        this.a = b;
        switch (b) {
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                this.b = new Object();
                this.c = new LinkedHashMap();
                new HashSet();
                break;
            default:
                this.b = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    public q59(i8h1 i8h1Var, String str, u7l0 u7l0Var, w6h1 w6h1Var) {
        this.a = (byte) 8;
        this.b = i8h1Var;
        this.c = new wqk0(u7l0Var, str, w6h1Var.b());
    }

    public q59(p1d p1dVar, iod iodVar) {
        this.a = (byte) 25;
        this.c = p1dVar;
        this.b = iodVar;
    }
}
