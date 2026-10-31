package p;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tw7 extends AudioDeviceCallback {
    public final /* synthetic */ t4d1 a;

    public tw7(t4d1 t4d1Var) {
        this.a = t4d1Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        qi qiVarC;
        ArrayList arrayList = new ArrayList(audioDeviceInfoArr.length);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(new rt7(audioDeviceInfo));
        }
        qt7[] qt7VarArr = (qt7[]) arrayList.toArray(new qt7[0]);
        jw7 jw7Var = (jw7) this.a.b;
        ArrayList arrayList2 = new ArrayList();
        for (qt7 qt7Var : qt7VarArr) {
            int type = qt7Var.getType();
            if (jw7.f(type) || type == 3 || type == 4 || type == 22) {
                arrayList2.add(qt7Var);
            }
        }
        ArrayList<qi> arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            qi qiVarE = null;
            if (!it.hasNext()) {
                break;
            }
            qt7 qt7Var2 = (qt7) it.next();
            if (jw7.f(qt7Var2.getType())) {
                qiVarE = jw7.c(qt7Var2);
            } else {
                int type2 = qt7Var2.getType();
                if (type2 == 3 || type2 == 4 || type2 == 22) {
                    qiVarE = jw7Var.e(qt7Var2);
                } else {
                    qt7Var2.getType();
                }
            }
            if (qiVarE != null) {
                arrayList3.add(qiVarE);
            }
        }
        bpb1 bpb1Var = jw7Var.c;
        List list = (List) bpb1Var.getValue();
        int iS = zno1.s(q7h.U(list, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list) {
            qi qiVar = (hi) obj;
            linkedHashMap.put(new mmr0(qiVar.b, qiVar.i), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (qi qiVar2 : arrayList3) {
            qi qiVar3 = qiVar2;
            linkedHashMap2.put(new mmr0(qiVar3.b, qiVar3.i), qiVar2);
        }
        List listL1 = o7h.l1(linkedHashMap2.values());
        if (arrayList3.size() == 1 && listL1.size() != 1) {
            List<qi> list2 = listL1;
            ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
            for (qi qiVar4 : list2) {
                qi qiVar5 = qiVar4;
                mmr0 mmr0Var = new mmr0(qiVar5.b, qiVar5.i);
                qi qiVar6 = (hi) o7h.q0(arrayList3);
                if (mmr0Var.equals(new mmr0(qiVar6.b, qiVar6.i))) {
                    Objects.toString(qiVar4);
                    qiVarC = qi.c(qiVar4, (String) null, (String) null, (String) null, (List) null, Boolean.TRUE, (axo1) null, (cn70) null, 223);
                } else {
                    Objects.toString(qiVar4);
                    qiVarC = qi.c(qiVar4, (String) null, (String) null, (String) null, (List) null, Boolean.FALSE, (axo1) null, (cn70) null, 223);
                }
                arrayList4.add(qiVarC);
            }
            listL1 = arrayList4;
        } else if (arrayList3.size() > 1) {
            arrayList3.toString();
        }
        bpb1Var.m((Object) null, listL1);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList(audioDeviceInfoArr.length);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(new rt7(audioDeviceInfo));
        }
        qt7[] qt7VarArr = (qt7[]) arrayList.toArray(new qt7[0]);
        jw7 jw7Var = (jw7) this.a.b;
        ArrayList arrayList2 = new ArrayList();
        for (qt7 qt7Var : qt7VarArr) {
            int type = qt7Var.getType();
            if (jw7.f(type) || type == 3 || type == 4 || type == 22) {
                arrayList2.add(qt7Var);
            }
        }
        ArrayList<qi> arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            qi qiVarE = null;
            if (!it.hasNext()) {
                break;
            }
            qt7 qt7Var2 = (qt7) it.next();
            if (jw7.f(qt7Var2.getType())) {
                qiVarE = jw7.c(qt7Var2);
            } else {
                int type2 = qt7Var2.getType();
                if (type2 == 3 || type2 == 4 || type2 == 22) {
                    qiVarE = jw7Var.e(qt7Var2);
                } else {
                    qt7Var2.getType();
                }
            }
            if (qiVarE != null) {
                arrayList3.add(qiVarE);
            }
        }
        bpb1 bpb1Var = jw7Var.c;
        List list = (List) bpb1Var.getValue();
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        for (qi qiVar : arrayList3) {
            arrayList4.add(new mmr0(qiVar.b, qiVar.i));
        }
        Set setP1 = o7h.p1(arrayList4);
        List<qi> list2 = list;
        ArrayList arrayList5 = new ArrayList(q7h.U(list2, 10));
        for (qi qiVar2 : list2) {
            arrayList5.add(new mmr0(qiVar2.b, qiVar2.i));
        }
        Set setP2 = o7h.p1(arrayList5);
        for (qi qiVar3 : arrayList3) {
            qi qiVar4 = qiVar3;
            if (!setP2.contains(new mmr0(qiVar4.b, qiVar4.i))) {
                Objects.toString(qiVar3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : list2) {
            qi qiVar5 = (hi) obj;
            if (!setP1.contains(new mmr0(qiVar5.b, qiVar5.i))) {
                arrayList6.add(obj);
            }
        }
        ArrayList arrayList7 = new ArrayList(arrayList6);
        if (arrayList7.size() == 1) {
            qi qiVar6 = (hi) arrayList7.get(0);
            if (qiVar6 instanceof qi) {
                qi qiVar7 = qiVar6;
                Boolean bool = qiVar7.g;
                Boolean bool2 = Boolean.TRUE;
                if (!u890.j(bool, bool2)) {
                    qiVar6.toString();
                    arrayList7.set(0, qi.c(qiVar7, (String) null, (String) null, (String) null, (List) null, bool2, (axo1) null, (cn70) null, 223));
                }
            }
        } else if (arrayList7.size() > 1) {
            arrayList7.size();
            Objects.toString(arrayList3);
        }
        Objects.toString(arrayList3);
        Objects.toString(list);
        arrayList7.toString();
        bpb1Var.m((Object) null, arrayList7);
    }
}
