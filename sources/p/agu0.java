package p;

import com.spotify.playlist4.proto.Playlist4ApiProto;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class agu0 implements vfu0 {
    public final hrh1 a;
    public final efe b;
    public final mev c;
    public final kiu0 d;
    public final vgq0 e;

    public agu0(hrh1 hrh1Var, efe efeVar, mev mevVar, kiu0 kiu0Var, vgq0 vgq0Var) {
        this.a = hrh1Var;
        this.b = efeVar;
        this.c = mevVar;
        this.d = kiu0Var;
        this.e = vgq0Var;
    }

    public static Playlist4ApiProto.ListChanges a(ufu0 ufu0Var) {
        Playlist4ApiProto.ListChanges.Builder builderNewBuilder = Playlist4ApiProto.ListChanges.newBuilder();
        Playlist4ApiProto.Delta.Builder builderNewBuilder2 = Playlist4ApiProto.Delta.newBuilder();
        Playlist4ApiProto.Op.Builder builderNewBuilder3 = Playlist4ApiProto.Op.newBuilder();
        builderNewBuilder3.setKind(Playlist4ApiProto.Op.Kind.UPDATE_LIST_ATTRIBUTES);
        String str = ufu0Var.a;
        String str2 = ufu0Var.c;
        String str3 = ufu0Var.d;
        Playlist4ApiProto.UpdateListAttributes.Builder builderNewBuilder4 = Playlist4ApiProto.UpdateListAttributes.newBuilder();
        Playlist4ApiProto.ListAttributesPartialState.Builder builderNewBuilder5 = Playlist4ApiProto.ListAttributesPartialState.newBuilder();
        Playlist4ApiProto.ListAttributes.Builder builderNewBuilder6 = Playlist4ApiProto.ListAttributes.newBuilder();
        builderNewBuilder6.setAiCurationReferenceId(phc.i(str2));
        builderNewBuilder6.setName(str3);
        ArrayList<String> arrayListE0 = ihc1.e0(str);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListE0, 10));
        for (String str4 : arrayListE0) {
            eth.h(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str4, 16)));
        }
        byte[] bArrG1 = o7h.g1(arrayList);
        builderNewBuilder6.setPicture(phc.e(0, bArrG1, bArrG1.length));
        builderNewBuilder5.setValues((Playlist4ApiProto.ListAttributes) builderNewBuilder6.build());
        builderNewBuilder4.setNewAttributes((Playlist4ApiProto.ListAttributesPartialState) builderNewBuilder5.build());
        builderNewBuilder3.setUpdateListAttributes((Playlist4ApiProto.UpdateListAttributes) builderNewBuilder4.build());
        builderNewBuilder2.addOps((Playlist4ApiProto.Op) builderNewBuilder3.build());
        Playlist4ApiProto.Op.Builder builderNewBuilder7 = Playlist4ApiProto.Op.newBuilder();
        builderNewBuilder7.setKind(Playlist4ApiProto.Op.Kind.ADD);
        Playlist4ApiProto.Add.Builder builderNewBuilder8 = Playlist4ApiProto.Add.newBuilder();
        builderNewBuilder8.setAddFirst(true);
        List<String> list = ufu0Var.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        for (String str5 : list) {
            Playlist4ApiProto.Item.Builder builderNewBuilder9 = Playlist4ApiProto.Item.newBuilder();
            builderNewBuilder9.setUri(str5);
            arrayList2.add((Playlist4ApiProto.Item) builderNewBuilder9.build());
        }
        builderNewBuilder8.addAllItems(arrayList2);
        builderNewBuilder7.setAdd((Playlist4ApiProto.Add) builderNewBuilder8.build());
        builderNewBuilder2.addOps((Playlist4ApiProto.Op) builderNewBuilder7.build());
        builderNewBuilder.addDeltas((Playlist4ApiProto.Delta) builderNewBuilder2.build());
        return (Playlist4ApiProto.ListChanges) builderNewBuilder.build();
    }

    public final Completable b(ufu0 ufu0Var) {
        Playlist4ApiProto.ListChanges listChangesA = a(ufu0Var);
        Single map = ud.a((ud) this.e.b, null, 1, null).map(aj20.a1);
        if (this.d.b.a()) {
            return map.flatMapCompletable(new wfu0(this, ufu0Var, listChangesA)).p(new yeu0(this, ufu0Var, (byte) 1));
        }
        return efe.b(this.b, ufu0Var.b, a(ufu0Var), null, 4, null).doOnError(xfs0.X).ignoreElement();
    }
}
