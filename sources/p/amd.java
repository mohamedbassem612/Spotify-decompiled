package p;

import com.spotify.kidsentitybanning.search.v1.ArtistEntity;
import com.spotify.kidsentitybanning.search.v1.SearchEntity;
import com.spotify.kidsentitybanning.search.v1.TrackEntity;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class amd {
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public Serializable a(h290 h290Var, onm onmVar) {
        ju00 ju00Var;
        l2i1 l2i1Var;
        h290 h290Var2;
        Iterator it;
        qy41 ry41Var;
        if (onmVar instanceof ju00) {
            ju00Var = (ju00) onmVar;
            int i = ju00Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ju00Var.e = i - Integer.MIN_VALUE;
            } else {
                ju00Var = new ju00(this, onmVar);
            }
        } else {
            ju00Var = new ju00(this, onmVar);
        }
        Object objB = ju00Var.c;
        int i2 = ju00Var.e;
        qy41 qy41Var = null;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        if (i2 == 0) {
            hm5.M(objB);
            if (!h290Var.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = h290Var.iterator();
                while (it2.hasNext()) {
                    SearchEntity searchEntity = (SearchEntity) it2.next();
                    int iO = searchEntity.o();
                    int i6 = iO == 0 ? -1 : iu00.a[l1d.C(iO)];
                    if (i6 == 1) {
                        linkedHashSet.add(searchEntity.p().getUri());
                        linkedHashSet2.add(searchEntity.p().n().getUri());
                    } else if (i6 == 2) {
                        linkedHashSet2.add(searchEntity.n().getUri());
                    } else {
                        if (i6 != 3) {
                            eg.o();
                            return null;
                        }
                        n57.e("Expected entity type for search entity: " + searchEntity);
                    }
                }
                l2i1 l2i1Var2 = new l2i1(linkedHashSet, linkedHashSet2);
                if (!linkedHashSet.isEmpty() || !linkedHashSet2.isEmpty()) {
                    ju00Var.a = h290Var;
                    ju00Var.b = l2i1Var2;
                    ju00Var.e = 1;
                    objB = b(linkedHashSet, linkedHashSet2, ju00Var);
                    d9n d9nVar = d9n.a;
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                    l2i1Var = l2i1Var2;
                    h290Var2 = h290Var;
                }
            }
            return z6x.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l2i1Var = ju00Var.b;
        h290Var2 = ju00Var.a;
        hm5.M(objB);
        uv00 uv00Var = (uv00) objB;
        LinkedHashSet linkedHashSet3 = l2i1Var.a;
        int iS = zno1.s(q7h.U(linkedHashSet3, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : linkedHashSet3) {
            linkedHashMap.put(obj, uv00Var.a(z1g1.class, (String) obj).b);
        }
        LinkedHashSet linkedHashSet4 = l2i1Var.b;
        int iS2 = zno1.s(q7h.U(linkedHashSet4, 10));
        if (iS2 < 16) {
            iS2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2);
        for (Object obj2 : linkedHashSet4) {
            linkedHashMap2.put(obj2, uv00Var.a(vy6.class, (String) obj2).b);
            qy41Var = qy41Var;
        }
        qy41 qy41Var2 = qy41Var;
        LinkedHashSet linkedHashSet5 = l2i1Var.a;
        int iS3 = zno1.s(q7h.U(linkedHashSet5, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
        for (Object obj3 : linkedHashSet5) {
            linkedHashMap3.put(obj3, uv00Var.a(ldj1.class, (String) obj3).b);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = h290Var2.iterator();
        while (it3.hasNext()) {
            SearchEntity searchEntity2 = (SearchEntity) it3.next();
            int iO2 = searchEntity2.o();
            int i7 = iO2 == 0 ? -1 : iu00.a[l1d.C(iO2)];
            if (i7 != i5) {
                if (i7 == i4) {
                    ArtistEntity artistEntityN = searchEntity2.n();
                    vy6 vy6Var = (vy6) linkedHashMap2.get(artistEntityN.getUri());
                    qy41 qy41Var3 = vy6Var != null ? vy6Var.b : qy41Var2;
                    if (qy41Var3 != null && !ihc1.y0(qy41Var3)) {
                        ry41Var = new qy41(UUID.randomUUID().toString(), artistEntityN.getUri(), qy41Var3, vy6Var.c.a, artistEntityN.getIsBanned());
                    }
                    it = it3;
                } else {
                    if (i7 != i3) {
                        eg.o();
                        return qy41Var2;
                    }
                    n57.e("Expected entity type for search entity: " + searchEntity2);
                }
                ry41Var = qy41Var2;
                it = it3;
            } else {
                TrackEntity trackEntityP = searchEntity2.p();
                z1g1 z1g1Var = (z1g1) linkedHashMap.get(trackEntityP.getUri());
                qy41 qy41Var4 = z1g1Var != null ? z1g1Var.b : qy41Var2;
                if (qy41Var4 == null || ihc1.y0(qy41Var4)) {
                    it = it3;
                    ry41Var = qy41Var2;
                } else {
                    String uri = trackEntityP.n().getUri();
                    ldj1 ldj1Var = (ldj1) linkedHashMap3.get(trackEntityP.getUri());
                    boolean z = (ldj1Var == null || ((ldj1Var.a.isEmpty() ? 1 : 0) ^ i5) != i5) ? 0 : i5;
                    String string = UUID.randomUUID().toString();
                    String uri2 = trackEntityP.getUri();
                    String str = z1g1Var.c.a;
                    boolean isBanned = trackEntityP.getIsBanned();
                    boolean z2 = z1g1Var.f;
                    ArrayList<qy41> arrayList2 = z1g1Var.g;
                    ArrayList arrayList3 = new ArrayList();
                    for (qy41 qy41Var5 : arrayList2) {
                        Iterator it4 = it3;
                        if (ihc1.y0(qy41Var5.b)) {
                            qy41Var5 = qy41Var2;
                        }
                        qy41 jq6Var = qy41Var5 != null ? new jq6(qy41Var5.a, qy41Var5.b) : qy41Var2;
                        if (jq6Var != null) {
                            arrayList3.add(jq6Var);
                        }
                        it3 = it4;
                        trackEntityP = trackEntityP;
                    }
                    it = it3;
                    ry41Var = new ry41(string, uri2, qy41Var4, str, isBanned, z2, arrayList3, uri, trackEntityP.n().getIsBanned(), z);
                }
            }
            if (ry41Var != null) {
                arrayList.add(ry41Var);
            }
            it3 = it;
            i3 = 3;
            i4 = 2;
            i5 = 1;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, onm onmVar) {
        ku00 ku00Var;
        if (onmVar instanceof ku00) {
            ku00Var = (ku00) onmVar;
            int i = ku00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ku00Var.c = i - Integer.MIN_VALUE;
            } else {
                ku00Var = new ku00(this, onmVar);
            }
        } else {
            ku00Var = new ku00(this, onmVar);
        }
        Object objL = ku00Var.a;
        int i2 = ku00Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableTimeout = this.a.b(new oi("gen_alpha_blocking_search", false, new lu00(linkedHashSet, linkedHashSet2, (byte) 0))).filter(j561.d1).timeout(10L, TimeUnit.SECONDS, Observable.error(new TimeoutException()));
            ku00Var.c = 1;
            objL = fc11.l(observableTimeout, 1, (Object) null, ku00Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return objL;
    }

    public dn6 c(int i, String str) {
        return new dn6(yoi1.g(this.a.b(new oi("capability", false, new w8c(str, (byte) 9)))), str, i, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        yd71 yd71Var;
        if (onmVar instanceof yd71) {
            yd71Var = (yd71) onmVar;
            int i = yd71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yd71Var.c = i - Integer.MIN_VALUE;
            } else {
                yd71Var = new yd71(this, onmVar);
            }
        } else {
            yd71Var = new yd71(this, onmVar);
        }
        Object objL = yd71Var.a;
        int i2 = yd71Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.a.b(new oi("episode-share", false, new pg61(str, (byte) 10))).filter(hgx0.X).map(new acn1(str, (byte) 13));
            yd71Var.c = 1;
            objL = fc11.l(map, 1, (Object) null, yd71Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        jo70 jo70Var = ((tv00) objL).b;
        if (jo70Var != null) {
            return jo70Var;
        }
        eg.m("IdentityTrait was null");
        return null;
    }
}
