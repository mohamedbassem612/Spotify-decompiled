package p;

import android.graphics.Color;
import com.spotify.kidsentitybanning.banning.v1.BanStatusRequest;
import com.spotify.kidsentitybanning.banning.v1.BanStatusResponse;
import com.spotify.kidsentitybanning.banning.v1.ChildBanStatus;
import com.spotify.kidsentitybanning.banning.v1.UpdateBanStatusRequest;
import com.spotify.kidsentitybanning.banning.v1.UpdateBanStatusResponse;
import com.spotify.kidsentitybanning.search.v1.ListViewRequest;
import com.spotify.kidsentitybanning.search.v1.ListViewResponse;
import com.spotify.kidsentitybanning.search.v1.SearchRequest;
import com.spotify.kidsentitybanning.search.v1.SearchResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class va40 {
    public final oa40 a;
    public final amd b;

    public va40(oa40 oa40Var, amd amdVar) {
        this.a = oa40Var;
        this.b = amdVar;
    }

    public static ArrayList c(BanStatusResponse banStatusResponse) {
        Integer numValueOf;
        h290<e0g> h290VarN = banStatusResponse.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (e0g e0gVar : h290VarN) {
            String childId = e0gVar.getChildId();
            String name = e0gVar.getName();
            String avatar = e0gVar.getAvatar();
            boolean zG = e0gVar.g();
            if (e0gVar.hasColor()) {
                int color = e0gVar.getColor();
                numValueOf = Integer.valueOf(Color.argb(255, Color.red(color), Color.green(color), Color.blue(color)));
            } else {
                numValueOf = null;
            }
            arrayList.add(new lc40(numValueOf, childId, name, avatar, zG));
        }
        return arrayList;
    }

    public static ArrayList i(UpdateBanStatusResponse updateBanStatusResponse, String str) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        h290<phc> h290VarN = updateBanStatusResponse.n();
        ArrayList arrayList = new ArrayList();
        for (phc phcVar : h290VarN) {
            phcVar.getClass();
            String strZ = qqn1.Z(phcVar, blc0Var);
            if (strZ != null) {
                arrayList.add(strZ);
            }
        }
        return arrayList;
    }

    public final Object a(String str, String str2, Integer num, String str3, onm onmVar) {
        e851 e851VarN = SearchRequest.n();
        e851VarN.n(str);
        e851VarN.s(str2);
        if (num != null) {
            e851VarN.q(num.intValue());
        }
        if (str3 != null) {
            e851VarN.r(str3);
        }
        return this.a.a(e851VarN.build(), fq21.a, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(String str, onm onmVar) {
        pa40 pa40Var;
        if (onmVar instanceof pa40) {
            pa40Var = (pa40) onmVar;
            int i = pa40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pa40Var.c = i - Integer.MIN_VALUE;
            } else {
                pa40Var = new pa40(this, onmVar);
            }
        } else {
            pa40Var = new pa40(this, onmVar);
        }
        Object objN = pa40Var.a;
        int i2 = pa40Var.c;
        if (i2 == 0) {
            hm5.M(objN);
            h4a h4aVarN = BanStatusRequest.n();
            h4aVarN.n(str);
            BanStatusRequest banStatusRequestBuild = h4aVarN.build();
            pa40Var.c = 1;
            objN = this.a.n(banStatusRequestBuild, fq21.a, pa40Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objN);
        }
        return c((BanStatusResponse) objN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, iyr0 iyr0Var, onm onmVar) {
        qa40 qa40Var;
        if (onmVar instanceof qa40) {
            qa40Var = (qa40) onmVar;
            int i = qa40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa40Var.c = i - Integer.MIN_VALUE;
            } else {
                qa40Var = new qa40(this, onmVar);
            }
        } else {
            qa40Var = new qa40(this, onmVar);
        }
        Object objM = qa40Var.a;
        int i2 = qa40Var.c;
        if (i2 == 0) {
            hm5.M(objM);
            r5d0 r5d0VarN = ListViewRequest.n();
            r5d0VarN.n(str);
            r5d0VarN.q(ulo1.t(iyr0Var));
            ListViewRequest listViewRequestBuild = r5d0VarN.build();
            listViewRequestBuild.getClass();
            qa40Var.c = 1;
            objM = this.a.m(listViewRequestBuild, fq21.a, qa40Var);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        return ulo1.r((ListViewResponse) objM);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(String str, String str2, Integer num, String str3, onm onmVar) {
        ra40 ra40Var;
        boolean z;
        String str4;
        if (onmVar instanceof ra40) {
            ra40Var = (ra40) onmVar;
            int i = ra40Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ra40Var.e = i - Integer.MIN_VALUE;
            } else {
                ra40Var = new ra40(this, onmVar);
            }
        } else {
            ra40Var = new ra40(this, onmVar);
        }
        ra40 ra40Var2 = ra40Var;
        Object objA = ra40Var2.c;
        int i2 = ra40Var2.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            ra40Var2.e = 1;
            objA = a(str, str2, num, str3, ra40Var2);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ra40Var2.b;
            str4 = ra40Var2.a;
            hm5.M(objA);
        }
        return new e951(str4, (List) objA, z);
        SearchResponse searchResponse = (SearchResponse) objA;
        String nextPageToken = searchResponse.getNextPageToken();
        nextPageToken.getClass();
        String str5 = nextPageToken.length() > 0 ? nextPageToken : null;
        boolean zO = searchResponse.o();
        h290 h290VarN = searchResponse.n();
        ra40Var2.a = str5;
        ra40Var2.b = zO;
        ra40Var2.e = 2;
        objA = this.b.a(h290VarN, ra40Var2);
        if (objA != d9nVar) {
            z = zO;
            str4 = str5;
            return new e951(str4, (List) objA, z);
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(String str, String str2, Integer num, String str3, onm onmVar) {
        sa40 sa40Var;
        if (onmVar instanceof sa40) {
            sa40Var = (sa40) onmVar;
            int i = sa40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa40Var.c = i - Integer.MIN_VALUE;
            } else {
                sa40Var = new sa40(this, onmVar);
            }
        } else {
            sa40Var = new sa40(this, onmVar);
        }
        sa40 sa40Var2 = sa40Var;
        Object objA = sa40Var2.a;
        int i2 = sa40Var2.c;
        if (i2 == 0) {
            hm5.M(objA);
            sa40Var2.c = 1;
            objA = a(str, str2, num, str3, sa40Var2);
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
        return voo1.w((SearchResponse) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(String str, Map map, onm onmVar) {
        ta40 ta40Var;
        if (onmVar instanceof ta40) {
            ta40Var = (ta40) onmVar;
            int i = ta40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta40Var.d = i - Integer.MIN_VALUE;
            } else {
                ta40Var = new ta40(this, onmVar);
            }
        } else {
            ta40Var = new ta40(this, onmVar);
        }
        Object objH = ta40Var.b;
        int i2 = ta40Var.d;
        if (i2 == 0) {
            hm5.M(objH);
            goh1 goh1VarO = UpdateBanStatusRequest.o();
            goh1VarO.r(str);
            for (Map.Entry entry : map.entrySet()) {
                d0g d0gVarN = ChildBanStatus.n();
                d0gVarN.r((String) entry.getKey());
                d0gVarN.q(((Boolean) entry.getValue()).booleanValue());
                goh1VarO.n(d0gVarN.build());
            }
            UpdateBanStatusRequest updateBanStatusRequestBuild = goh1VarO.build();
            ta40Var.a = str;
            ta40Var.d = 1;
            objH = this.a.h(updateBanStatusRequestBuild, fq21.a, ta40Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ta40Var.a;
            hm5.M(objH);
        }
        return i((UpdateBanStatusResponse) objH, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable h(String str, String str2, g4a g4aVar, onm onmVar) {
        ua40 ua40Var;
        if (onmVar instanceof ua40) {
            ua40Var = (ua40) onmVar;
            int i = ua40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ua40Var.d = i - Integer.MIN_VALUE;
            } else {
                ua40Var = new ua40(this, onmVar);
            }
        } else {
            ua40Var = new ua40(this, onmVar);
        }
        Object objH = ua40Var.b;
        int i2 = ua40Var.d;
        if (i2 == 0) {
            hm5.M(objH);
            f4a f4aVarQ = e6p1.q(g4aVar);
            goh1 goh1VarO = UpdateBanStatusRequest.o();
            goh1VarO.r(str);
            d0g d0gVarN = ChildBanStatus.n();
            d0gVarN.r(str2);
            d0gVarN.n(f4aVarQ);
            goh1VarO.q(d0gVarN);
            UpdateBanStatusRequest updateBanStatusRequestBuild = goh1VarO.build();
            updateBanStatusRequestBuild.getClass();
            ua40Var.a = str;
            ua40Var.d = 1;
            objH = this.a.h(updateBanStatusRequestBuild, fq21.a, ua40Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ua40Var.a;
            hm5.M(objH);
        }
        return i((UpdateBanStatusResponse) objH, str);
    }
}
