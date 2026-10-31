package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class iwc0 extends tv30 implements xu30 {
    public static final iwc0 a = new iwc0(3, lwc0.class, "defaultLoadedItems", "defaultLoadedItems(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/ListModel;ILcom/spotify/yourlibrary/yourlibraryx/shared/domain/Loaded;)Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/Items;", 1);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        sxc0 sxc0Var = (sxc0) obj;
        int iIntValue = ((Number) obj2).intValue();
        b8e0 b8e0Var = (b8e0) obj3;
        mml mmlVar = sxc0Var.a.e;
        if (!(mmlVar instanceof kml) || (str = ((kml) mmlVar).a) == null || str.length() == 0) {
            return sxc0Var.f instanceof ln01 ? new rn90(iIntValue, b8e0Var.getCount(), b8e0Var.a(), b8e0Var.getItems(), b8e0Var.b()) : new mn90(iIntValue, b8e0Var.getCount(), b8e0Var.a(), b8e0Var.getItems(), b8e0Var.g(), b8e0Var.getFilters(), b8e0Var.b(), b8e0Var.h());
        }
        return new sn90(iIntValue, b8e0Var.getCount(), b8e0Var.a(), b8e0Var.getItems(), b8e0Var.b());
    }
}
