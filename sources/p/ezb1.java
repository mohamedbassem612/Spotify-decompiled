package p;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.campaignsservice.retrieval.v1.Retrieval;
import com.spotify.campaignsservice.retrieval.v1.RetrievalCard;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.p4p.ucp.suggestedprompts.v1.GetSuggestedPromptsRequest;
import com.spotify.p4p.ucp.suggestedprompts.v1.GetSuggestedPromptsResponse;
import com.spotify.p4p.ucp.suggestedprompts.v1.SuggestedPrompt;
import com.spotify.player.model.PlayerState;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ezb1 implements Function, Producer, BiFunction, y1f1, sh, qiw, a3k1, m7b1, acp1, vy11 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ezb1() {
        this.a = (byte) 25;
        this.b = b380.m();
    }

    public void a(i1d1 i1d1Var) {
        l1d1 l1d1Var = (l1d1) this.b;
        int length = l1d1Var.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = l1d1Var.d[i];
            if (i2 == 1) {
                i1d1Var.r(i, l1d1Var.e[i]);
            } else if (i2 == 2) {
                i1d1Var.s(l1d1Var.f[i], i);
            } else if (i2 == 3) {
                String str = l1d1Var.g[i];
                str.getClass();
                i1d1Var.w0(i, str);
            } else if (i2 == 4) {
                byte[] bArr = l1d1Var.h[i];
                bArr.getClass();
                i1d1Var.n(bArr, i);
            } else if (i2 == 5) {
                i1d1Var.t(i);
            }
        }
    }

    public void accept(Object obj, Object obj2) {
        lc80 lc80Var = (lc80) this.b;
        IBinder xlo1Var = new xlo1((bsd1) obj2, (byte) 1);
        b7o1 b7o1VarN = ((bvo1) obj).n();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i = ysn1.a;
        parcelObtain.writeStrongBinder(xlo1Var);
        parcelObtain.writeInt(1);
        lc80Var.writeToParcel(parcelObtain, 0);
        b7o1VarN.s(1, parcelObtain);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((dzb1) ((w2s) obj2).i).a.J(new zb91((Integer) obj, (byte) 6));
            case 3:
                List list = (List) obj;
                ysc1 ysc1Var = (ysc1) obj2;
                return Collections.singletonMap(ysc1Var.i.a, new v491(new ivd(list, !list.isEmpty(), (el51) null, w7x.a, ysc1Var.e)));
            case 12:
                LinearLayoutManager layoutManager = ((TranscriptListView) obj2).getLayoutManager();
                return new acg1(layoutManager.f1(), layoutManager.h1());
            case 14:
                return ((lih1) obj2).c((CollectionGetUnplayedEpisodesResponse) obj);
            case 18:
                Instant instantOfEpochMilli = Instant.ofEpochMilli(((kji1) obj2).c.b());
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                return Boolean.valueOf(ChronoUnit.DAYS.between(Instant.ofEpochMilli(((Long) obj).longValue()).atZone(zoneOffset).toLocalDate(), instantOfEpochMilli.atZone(zoneOffset).toLocalDate()) >= 14);
            case 20:
                Set set = (Set) obj;
                if (((cv4) ((kls0) obj2).c).a() && !set.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                return new psk1(((onr) obj2).a());
            default:
                return ((mwm1) ((yut0) obj2).c).b((YourLibraryRequest) obj);
        }
    }

    public void b(Intent intent) {
        ((vu30) this.b).invoke(intent, 1780);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, String str2, onm onmVar) {
        qch1 qch1Var;
        m231 m231Var;
        if (onmVar instanceof qch1) {
            qch1Var = (qch1) onmVar;
            int i = qch1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qch1Var.c = i - Integer.MIN_VALUE;
            } else {
                qch1Var = new qch1(this, onmVar);
            }
        } else {
            qch1Var = new qch1(this, onmVar);
        }
        Object objB = qch1Var.a;
        int i2 = qch1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                bh80 bh80Var = new bh80(str, str2);
                sch1 sch1Var = (sch1) this.b;
                qch1Var.c = 1;
                objB = sch1Var.b(bh80Var, qch1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            m231Var = (eh80) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            List list = ((eh80) m231Var).a;
            m231Var = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m231Var.add(new vg80(((yg80) it.next()).a));
            }
        }
        return m231Var instanceof m231 ? z6x.a : m231Var;
    }

    public plf1 d(lby lbyVar, jjf1 jjf1Var, boolean z, boolean z2, d8r0 d8r0Var, String str, String str2, int i, boolean z3, boolean z4, Integer num, String str3, boolean z5, boolean z6) {
        String str4;
        String str5;
        String str6;
        if (z3 || z4) {
            p1g1 p1g1Var = jjf1Var.N0;
            if ((p1g1Var instanceof n1g1) || (p1g1Var instanceof o1g1) || !(p1g1Var instanceof j1g1) || (str4 = jjf1Var.X) == null) {
                str4 = lbyVar.a;
            }
        } else {
            str4 = lbyVar.a;
        }
        String str7 = str4;
        String str8 = lbyVar.a;
        String str9 = lbyVar.b;
        String str10 = lbyVar.c;
        boolean z7 = jjf1Var.a;
        p1g1 p1g1Var2 = jjf1Var.N0;
        int i2 = 1;
        if (!jjf1Var.e) {
            i2 = z7 ? 2 : 3;
        }
        boolean z8 = jjf1Var.f;
        boolean z9 = jjf1Var.b;
        p2q0 p2q0Var = jjf1Var.g;
        String str11 = p2q0Var.b;
        String str12 = p2q0Var.a;
        p7w p7wVar = (str12.length() <= 0 || str11.length() <= 0) ? null : new p7w(str12, str11);
        q8b q8bVarY = aq8.y(lbyVar, jjf1Var, z);
        List list = jjf1Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ol11) it.next()).a);
        }
        boolean zW = qxy0.w(p1g1Var2);
        boolean z10 = jjf1Var.h || !u890.j(jjf1Var.i, ypl.a);
        aql aqlVar = jjf1Var.i;
        String str13 = lbyVar.d;
        String str14 = jjf1Var.t;
        boolean z11 = p1g1Var2 instanceof o1g1;
        boolean z12 = jjf1Var.Y && z6;
        boolean z13 = (p1g1Var2 instanceof n1g1) || z11;
        ArrayList arrayListU = twa.u(jjf1Var.Z);
        String str15 = lbyVar.a;
        boolean z14 = jjf1Var.Q0;
        if (z4) {
            str5 = str15;
            long j = jjf1Var.P0.a;
            if (j > 0) {
                int i3 = (int) (j / 3600);
                int i4 = ((int) (j / 60)) - (i3 * 60);
                long j2 = j % 60;
                str6 = i3 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j2)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Long.valueOf(j2)}, 2));
            }
            return new plf1(str8, str7, str13, str9, str2, str10, str14, i2, d8r0Var, str, z8, z9, p7wVar, arrayList, q8bVarY, zW, z10, aqlVar, i, z3, z2, z5, z11, z4, z13, z12, arrayListU, str5, num, str3, str6, z14, Integer.MIN_VALUE, 0);
        }
        str5 = str15;
        str6 = "";
        return new plf1(str8, str7, str13, str9, str2, str10, str14, i2, d8r0Var, str, z8, z9, p7wVar, arrayList, q8bVarY, zW, z10, aqlVar, i, z3, z2, z5, z11, z4, z13, z12, arrayListU, str5, num, str3, str6, z14, Integer.MIN_VALUE, 0);
    }

    public String e() {
        return ((n1d1) ((l1d1) this.b)).b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable f(onm onmVar) {
        o6c1 o6c1Var;
        if (onmVar instanceof o6c1) {
            o6c1Var = (o6c1) onmVar;
            int i = o6c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o6c1Var.c = i - Integer.MIN_VALUE;
            } else {
                o6c1Var = new o6c1(this, onmVar);
            }
        } else {
            o6c1Var = new o6c1(this, onmVar);
        }
        Object objA = o6c1Var.a;
        int i2 = o6c1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            k931 k931Var = (k931) this.b;
            o6c1Var.c = 1;
            objA = k931Var.a(o6c1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        h290 h290VarO = ((Retrieval) objA).o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        Iterator it = h290VarO.iterator();
        while (it.hasNext()) {
            arrayList.add(((RetrievalCard) it.next()).o());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, onm onmVar) {
        rch1 rch1Var;
        GetSuggestedPromptsResponse m231Var;
        int i;
        if (onmVar instanceof rch1) {
            rch1Var = (rch1) onmVar;
            int i2 = rch1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rch1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                rch1Var = new rch1(this, onmVar);
            }
        } else {
            rch1Var = new rch1(this, onmVar);
        }
        Object objA = rch1Var.a;
        int i3 = rch1Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objA);
                oq40 oq40VarN = GetSuggestedPromptsRequest.n();
                oq40VarN.n(str);
                GetSuggestedPromptsRequest getSuggestedPromptsRequestBuild = oq40VarN.build();
                sch1 sch1Var = (sch1) this.b;
                getSuggestedPromptsRequestBuild.getClass();
                rch1Var.c = 1;
                objA = sch1Var.a(getSuggestedPromptsRequestBuild, rch1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = (GetSuggestedPromptsResponse) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            List<SuggestedPrompt> suggestedPromptsList = m231Var.getSuggestedPromptsList();
            m231Var = new ArrayList(q7h.U(suggestedPromptsList, 10));
            for (SuggestedPrompt suggestedPrompt : suggestedPromptsList) {
                String strO = suggestedPrompt.o();
                String strN = suggestedPrompt.n();
                if (strN == null) {
                    i = 0;
                } else {
                    int iHashCode = strN.hashCode();
                    if (iHashCode != -1390986978) {
                        if (iHashCode != -713180206) {
                            if (iHashCode == 1802501401 && strN.equals("UCP_UNSCHEDULED_ADD")) {
                                i = 3;
                            } else {
                                i = 0;
                            }
                        } else if (strN.equals("UCP_SCHEDULED_ADD")) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                    } else if (strN.equals("UCP_REORDER")) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                }
                m231Var.add(new jtc1(strO, i));
            }
        }
        return m231Var instanceof m231 ? z6x.a : m231Var;
    }

    public Object get() {
        return new DispatcherWorker(((jhd1) this.b).d);
    }

    public plf1 h(lby lbyVar, jjf1 jjf1Var, boolean z, boolean z2, d8r0 d8r0Var, String str, int i, Integer num, String str2, boolean z3, boolean z4) {
        p1g1 p1g1Var = jjf1Var.N0;
        tkf1 tkf1Var = jjf1Var.O0;
        boolean z5 = ((p1g1Var instanceof o1g1) || (p1g1Var instanceof n1g1)) && ((tkf1Var instanceof rkf1) || (tkf1Var instanceof qkf1));
        tb51 tb51Var = (tb51) this.b;
        tb51Var.getClass();
        return d(lbyVar, jjf1Var, z, z2, d8r0Var, str, tb51.i(tb51Var, lbyVar, z5, false, 4).toString(), i, false, z5, num, str2, z3, z4);
    }

    public plf1 i(lby lbyVar, jjf1 jjf1Var, boolean z, boolean z2, d8r0 d8r0Var, String str, int i, boolean z3, boolean z4, boolean z5) {
        String string;
        tb51 tb51Var = (tb51) this.b;
        if (z3) {
            tb51Var.getClass();
            string = tb51.i(tb51Var, lbyVar, true, false, 4).toString();
        } else {
            string = tb51Var.c(lbyVar).toString();
        }
        String str2 = string;
        p1g1 p1g1Var = jjf1Var.N0;
        tkf1 tkf1Var = jjf1Var.O0;
        return d(lbyVar, jjf1Var, z, z2, d8r0Var, str, str2, i, z3, ((p1g1Var instanceof o1g1) || (p1g1Var instanceof n1g1)) && ((tkf1Var instanceof rkf1) || (tkf1Var instanceof qkf1)), null, null, z4, z5);
    }

    public void j(VideoSurfaceView videoSurfaceView) {
        ((w2k1) this.b).d(videoSurfaceView);
    }

    public boolean r(View view) {
        ((qvs) this.b).invoke(fzf1.g);
        return true;
    }

    public void v(Object obj) {
        bfj1 bfj1Var = (bfj1) obj;
        mfj1 mfj1Var = (mfj1) this.b;
        if (bfj1Var == null) {
            return;
        }
        CardView cardView = (CardView) mfj1Var.h.h;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = bfj1Var.a;
        layoutParams.height = bfj1Var.b;
        cardView.setLayoutParams(layoutParams);
    }

    public Object zza(Object obj) {
        dep1 dep1Var = (dep1) obj;
        float f = dep1Var.f;
        return new qzd1(dep1Var, (Matrix) this.b);
    }

    public ezb1(vzx vzxVar, lie1 lie1Var) {
        this.a = (byte) 6;
        this.b = lie1Var;
    }

    public /* synthetic */ ezb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ezb1(tb51 tb51Var, twa twaVar) {
        this.a = (byte) 8;
        this.b = tb51Var;
    }

    public Object apply(Object obj, Object obj2) {
        int i;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 6:
                l62 l62Var = (l62) obj;
                Long l = (Long) obj2;
                lie1 lie1Var = (lie1) obj3;
                lhe1 lhe1Var = lie1Var.b;
                mhe1 mhe1Var = lie1Var.a;
                mhe1 mhe1Var2 = mhe1.a;
                lhe1 lhe1Var2 = lhe1.a;
                if (lhe1Var == lhe1Var2 && mhe1Var == mhe1Var2) {
                    i = 1;
                } else if (lhe1Var == lhe1Var2 && mhe1Var == mhe1.b) {
                    i = 3;
                } else {
                    i = (lhe1Var == lhe1.b && mhe1Var == mhe1Var2) ? 2 : 4;
                }
                return new w90(l62Var, i, l.longValue());
            case 9:
                return new CompletableFromAction(new dkb1((mtf1) obj3, mtf1.b((PlayerState) obj, ((Boolean) obj2).booleanValue(), false), (byte) 7));
            default:
                List list = (List) obj2;
                List list2 = (List) obj;
                x5u x5uVar = (x5u) ((hce1) obj3).d;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(zgo1.v((fhb) it.next(), ((Boolean) x5uVar.invoke()).booleanValue()));
                }
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(zgo1.w((tul1) it2.next(), ((Boolean) x5uVar.invoke()).booleanValue()));
                }
                return o7h.N0(arrayList2, arrayList);
        }
    }
}
