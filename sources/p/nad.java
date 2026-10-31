package p;

import com.google.protobuf.Timestamp;
import com.google.type.Interval;
import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.datasource.impl.ChatFetchException;
import com.spotify.campfire.datasource.impl.ChatsFetchException;
import com.spotify.campfire.datasource.impl.proto.ActivityRequest;
import com.spotify.campfire.datasource.impl.proto.AddActivity;
import com.spotify.campfire.datasource.impl.proto.AddContribution;
import com.spotify.campfire.datasource.impl.proto.AddContributionForGroup;
import com.spotify.campfire.datasource.impl.proto.AddMembers;
import com.spotify.campfire.datasource.impl.proto.AddMembersRequest;
import com.spotify.campfire.datasource.impl.proto.AddMembersResponse;
import com.spotify.campfire.datasource.impl.proto.Asset;
import com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequest;
import com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponse;
import com.spotify.campfire.datasource.impl.proto.ClaimInviteRequest;
import com.spotify.campfire.datasource.impl.proto.ClientNode;
import com.spotify.campfire.datasource.impl.proto.ClientNodeRequest;
import com.spotify.campfire.datasource.impl.proto.ClientNodeResponse;
import com.spotify.campfire.datasource.impl.proto.ContributionMetadata;
import com.spotify.campfire.datasource.impl.proto.ContributionPayload;
import com.spotify.campfire.datasource.impl.proto.CreateGroupOptions;
import com.spotify.campfire.datasource.impl.proto.CreateGroupRequest;
import com.spotify.campfire.datasource.impl.proto.CreateGroupResponse;
import com.spotify.campfire.datasource.impl.proto.CreateInviteRequest;
import com.spotify.campfire.datasource.impl.proto.CreateInviteResponse;
import com.spotify.campfire.datasource.impl.proto.CreateNew;
import com.spotify.campfire.datasource.impl.proto.DeleteContribution;
import com.spotify.campfire.datasource.impl.proto.EmojiReaction;
import com.spotify.campfire.datasource.impl.proto.FreeText;
import com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsRequest;
import com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponse;
import com.spotify.campfire.datasource.impl.proto.GiphyAgeRating;
import com.spotify.campfire.datasource.impl.proto.GiphyGif;
import com.spotify.campfire.datasource.impl.proto.GroupDetail;
import com.spotify.campfire.datasource.impl.proto.Hierarchy;
import com.spotify.campfire.datasource.impl.proto.HierarchyIdentifier;
import com.spotify.campfire.datasource.impl.proto.HierarchyRequest;
import com.spotify.campfire.datasource.impl.proto.HierarchyType;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus;
import com.spotify.campfire.datasource.impl.proto.InviteLinkOpenRequest;
import com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse;
import com.spotify.campfire.datasource.impl.proto.InviteOptions;
import com.spotify.campfire.datasource.impl.proto.LatestNodeResponse;
import com.spotify.campfire.datasource.impl.proto.ListeningActivity;
import com.spotify.campfire.datasource.impl.proto.ListeningStatsInteraction;
import com.spotify.campfire.datasource.impl.proto.ListeningStatsTopArtistContent;
import com.spotify.campfire.datasource.impl.proto.ListeningStatsTopTrackContent;
import com.spotify.campfire.datasource.impl.proto.MessagePayload;
import com.spotify.campfire.datasource.impl.proto.MessageRequest;
import com.spotify.campfire.datasource.impl.proto.NodeRequest;
import com.spotify.campfire.datasource.impl.proto.OffplatformOpenRequest;
import com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponse;
import com.spotify.campfire.datasource.impl.proto.PlaylistInvitation;
import com.spotify.campfire.datasource.impl.proto.PlaylistMessage;
import com.spotify.campfire.datasource.impl.proto.PlaylistReaction;
import com.spotify.campfire.datasource.impl.proto.PlaylistReply;
import com.spotify.campfire.datasource.impl.proto.ReceiptType;
import com.spotify.campfire.datasource.impl.proto.RemoveMember;
import com.spotify.campfire.datasource.impl.proto.RemoveMemberRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponse;
import com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveNodeResponse;
import com.spotify.campfire.datasource.impl.proto.RichMedia;
import com.spotify.campfire.datasource.impl.proto.SetParticipationStatus;
import com.spotify.campfire.datasource.impl.proto.SharedHierarchies;
import com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntry;
import com.spotify.campfire.datasource.impl.proto.SortOrder;
import com.spotify.campfire.datasource.impl.proto.Sticker;
import com.spotify.campfire.datasource.impl.proto.TrackedShare;
import com.spotify.campfire.datasource.impl.proto.TrackedShareContext;
import com.spotify.campfire.datasource.impl.proto.UGC;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nad implements bdd {
    public final pad a;
    public final ddd b;

    public nad(pad padVar, ddd dddVar, sg31 sg31Var) {
        this.a = padVar;
        this.b = dddVar;
    }

    public static ContributionPayload.Builder d(b9d b9dVar) {
        ContributionPayload.Builder freeText = ContributionPayload.newBuilder().setFreeText(FreeText.newBuilder().setMessageText(b9dVar.b()));
        if (b9dVar.a() != null) {
            freeText.setMetadata(ContributionMetadata.newBuilder().setMessageEnvelope(b9dVar.a()));
        }
        freeText.getClass();
        return freeText;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static ContributionPayload.Builder f(String str, String str2, o9d o9dVar, String str3, String str4) throws NoWhenBranchMatchedException {
        TrackedShare.Builder uri = TrackedShare.newBuilder().setUri(str);
        if (str2 != null && !ihc1.y0(str2)) {
            uri.setPreviewId(str2);
        }
        if (str4 != null && !ihc1.y0(str4)) {
            uri.setShareCardConfigId(str4);
        }
        if (o9dVar != null) {
            if (o9dVar instanceof f9d) {
                f9d f9dVar = (f9d) o9dVar;
                uri.setContext(TrackedShareContext.newBuilder().setListeningActivity(ListeningActivity.newBuilder().setReaction(f9dVar.b()).setListeningUsername(f9dVar.a())));
            } else if (o9dVar instanceof l9d) {
                l9d l9dVar = (l9d) o9dVar;
                ArrayList<String> arrayListE0 = ihc1.e0(l9dVar.a());
                ArrayList arrayList = new ArrayList(q7h.U(arrayListE0, 10));
                for (String str5 : arrayListE0) {
                    eth.h(16);
                    arrayList.add(Byte.valueOf((byte) Integer.parseInt(str5, 16)));
                }
                byte[] bArrG1 = o7h.g1(arrayList);
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistReaction(PlaylistReaction.newBuilder().setReaction(l9dVar.c()).setPlaylistUri(l9dVar.b()).setItemId(phc.e(0, bArrG1, bArrG1.length))));
            } else if (o9dVar instanceof n9d) {
                n9d n9dVar = (n9d) o9dVar;
                ArrayList<String> arrayListE1 = ihc1.e0(n9dVar.a());
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayListE1, 10));
                for (String str6 : arrayListE1) {
                    eth.h(16);
                    arrayList2.add(Byte.valueOf((byte) Integer.parseInt(str6, 16)));
                }
                byte[] bArrG2 = o7h.g1(arrayList2);
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistReply(PlaylistReply.newBuilder().setPlaylistUri(n9dVar.b()).setItemId(phc.e(0, bArrG2, bArrG2.length))));
            } else if (o9dVar instanceof m9d) {
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistMessage(PlaylistMessage.newBuilder().setPlaylistUri(((m9d) o9dVar).a())));
            } else if (o9dVar instanceof k9d) {
                uri.setContext(TrackedShareContext.newBuilder().setPlaylistInvitation(PlaylistInvitation.newBuilder().setPlaylistInvitationUri(((k9d) o9dVar).a())));
            } else {
                if (!(o9dVar instanceof j9d)) {
                    eg.o();
                    return null;
                }
                j9d j9dVar = (j9d) o9dVar;
                ListeningStatsInteraction.Builder reaction = ListeningStatsInteraction.newBuilder().setReaction(j9dVar.c());
                long jD = j9dVar.d();
                long jB = j9dVar.b();
                f890 f890VarS = Interval.s();
                sve1 sve1VarR = Timestamp.r();
                sve1VarR.q(jD);
                f890VarS.q(sve1VarR);
                sve1 sve1VarR2 = Timestamp.r();
                sve1VarR2.q(jB);
                f890VarS.n(sve1VarR2);
                ListeningStatsInteraction.Builder timeRange = reaction.setTimeRange(f890VarS.build());
                h9d h9dVarA = j9dVar.a();
                if (h9dVarA instanceof h9d) {
                    timeRange.setTopTrack(ListeningStatsTopTrackContent.newBuilder().setEntityUri(h9dVarA.a()));
                } else {
                    if (!(h9dVarA instanceof g9d)) {
                        eg.o();
                        return null;
                    }
                    timeRange.setTopArtist(ListeningStatsTopArtistContent.newBuilder().setEntityUri(((g9d) h9dVarA).a()));
                }
                uri.setContext(TrackedShareContext.newBuilder().setListeningStatsInteraction(timeRange));
            }
        }
        ContributionPayload.Builder trackedShare = ContributionPayload.newBuilder().setTrackedShare(uri);
        if (str3 != null) {
            trackedShare.setMetadata(ContributionMetadata.newBuilder().setMessageEnvelope(str3));
        }
        trackedShare.getClass();
        return trackedShare;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(String str, boolean z, ContributionPayload.Builder[] builderArr, onm onmVar) throws NoWhenBranchMatchedException {
        kad kadVar;
        if (onmVar instanceof kad) {
            kadVar = (kad) onmVar;
            int i = kadVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kadVar.d = i - Integer.MIN_VALUE;
            } else {
                kadVar = new kad(this, onmVar);
            }
        } else {
            kadVar = new kad(this, onmVar);
        }
        Object objD = kadVar.b;
        int i2 = kadVar.d;
        if (i2 == 0) {
            ArrayList arrayListJ = hrt.j(objD);
            for (ContributionPayload.Builder builder : builderArr) {
                arrayListJ.add(NodeRequest.newBuilder().setMessageRequest(MessageRequest.newBuilder().setAddContribution(AddContribution.newBuilder().setParentNodePathId(str).setPayload(builder))));
            }
            NodeRequest.Builder[] builderArr2 = (NodeRequest.Builder[]) arrayListJ.toArray(new NodeRequest.Builder[0]);
            NodeRequest.Builder[] builderArr3 = (NodeRequest.Builder[]) Arrays.copyOf(builderArr2, builderArr2.length);
            boolean z2 = !z;
            kadVar.a = this;
            kadVar.d = 1;
            objD = D(builderArr3, z2, z2, kadVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = kadVar.a;
            hm5.M(objD);
        }
        goe goeVarD = this.b.d((ClientNodeResponse) objD);
        if (goeVarD != null) {
            return goeVarD;
        }
        eg.m("Invalid chat after sending contributions");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object B(String str, e9d[] e9dVarArr, boolean z, xed xedVar) throws NoWhenBranchMatchedException {
        ContributionPayload.Builder builderE;
        ArrayList arrayList = new ArrayList(e9dVarArr.length);
        for (e9d e9dVar : e9dVarArr) {
            if (e9dVar instanceof b9d) {
                builderE = d((b9d) e9dVar);
            } else if (e9dVar instanceof d9d) {
                d9d d9dVar = (d9d) e9dVar;
                builderE = f(d9dVar.b(), d9dVar.d(), d9dVar.a(), d9dVar.c(), d9dVar.e());
            } else {
                if (!(e9dVar instanceof c9d)) {
                    eg.o();
                    return null;
                }
                builderE = e(((c9d) e9dVar).a());
            }
            arrayList.add(builderE);
        }
        ContributionPayload.Builder[] builderArr = (ContributionPayload.Builder[]) arrayList.toArray(new ContributionPayload.Builder[0]);
        return A(str, z, (ContributionPayload.Builder[]) Arrays.copyOf(builderArr, builderArr.length), xedVar);
    }

    public final Object C(boolean z, GroupDetail.Builder builder, CreateGroupOptions createGroupOptions, ContributionPayload.Builder[] builderArr, onm onmVar) {
        ArrayList arrayList = new ArrayList();
        for (ContributionPayload.Builder builder2 : builderArr) {
            AddContributionForGroup.Builder payload = AddContributionForGroup.newBuilder().setGroupDetail(builder).setPayload(builder2);
            if (createGroupOptions == null) {
                payload.setCreateNewHierarchy(z);
            } else {
                payload.setCreateGroupOptions(createGroupOptions);
            }
            arrayList.add(NodeRequest.newBuilder().setMessageRequest(MessageRequest.newBuilder().setAddContributionForGroup(payload)));
        }
        NodeRequest.Builder[] builderArr2 = (NodeRequest.Builder[]) arrayList.toArray(new NodeRequest.Builder[0]);
        return D((NodeRequest.Builder[]) Arrays.copyOf(builderArr2, builderArr2.length), false, false, onmVar);
    }

    public final Object D(NodeRequest.Builder[] builderArr, boolean z, boolean z2, onm onmVar) {
        ClientNodeRequest.Builder builderNewBuilder = ClientNodeRequest.newBuilder();
        for (NodeRequest.Builder builder : builderArr) {
            builderNewBuilder.addNodeRequest(builder);
        }
        builderNewBuilder.setOmitPubsubEvents(z);
        builderNewBuilder.setOmitLatestNodeUpdates(z2);
        return this.a.r((ClientNodeRequest) builderNewBuilder.build(), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, String str2, onm onmVar, boolean z) {
        lad ladVar;
        if (onmVar instanceof lad) {
            ladVar = (lad) onmVar;
            int i = ladVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ladVar.d = i - Integer.MIN_VALUE;
            } else {
                ladVar = new lad(this, onmVar);
            }
        } else {
            ladVar = new lad(this, onmVar);
        }
        Object objD = ladVar.b;
        int i2 = ladVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            ActivityRequest.Builder emojiReaction = ActivityRequest.newBuilder().setEmojiReaction(EmojiReaction.newBuilder().setEmojiUtf8(str2));
            ladVar.a = this;
            ladVar.d = 1;
            MessageRequest.Builder addActivity = MessageRequest.newBuilder().setAddActivity(AddActivity.newBuilder().setParentNodePathId(str).setRequest(emojiReaction));
            addActivity.getClass();
            NodeRequest.Builder messageRequest = NodeRequest.newBuilder().setMessageRequest(addActivity);
            messageRequest.getClass();
            boolean z2 = !z;
            objD = D(new NodeRequest.Builder[]{messageRequest}, z2, z2, ladVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ladVar.a;
            hm5.M(objD);
        }
        gxz0 gxz0VarG = this.b.g((ClientNode) o7h.q0(((ClientNodeResponse) objD).getClientNodeList()));
        if (gxz0VarG != null) {
            return gxz0VarG;
        }
        eg.m("Invalid reaction");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(String str, HierarchyUserParticipationStatus hierarchyUserParticipationStatus, onm onmVar) throws NoWhenBranchMatchedException {
        mad madVar;
        if (onmVar instanceof mad) {
            madVar = (mad) onmVar;
            int i = madVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                madVar.d = i - Integer.MIN_VALUE;
            } else {
                madVar = new mad(this, onmVar);
            }
        } else {
            madVar = new mad(this, onmVar);
        }
        Object objD = madVar.b;
        int i2 = madVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            NodeRequest.Builder[] builderArr = {NodeRequest.newBuilder().setHierarchyRequest(HierarchyRequest.newBuilder().setParticipationStatus(SetParticipationStatus.newBuilder().setHierarchyId(str).setUserParticipationStatus(hierarchyUserParticipationStatus)))};
            madVar.a = this;
            madVar.d = 1;
            objD = D(builderArr, false, false, madVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = madVar.a;
            hm5.M(objD);
        }
        goe goeVarD = this.b.d((ClientNodeResponse) objD);
        if (goeVarD != null) {
            return goeVarD;
        }
        eg.m("Invalid chat after deleting contribution");
        return null;
    }

    @Override // p.bdd
    public final goe b(Hierarchy hierarchy, List list, gxz0 gxz0Var) {
        return this.b.b(hierarchy, list, gxz0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ArrayList arrayList, onm onmVar) {
        q9d q9dVar;
        piz pizVarC;
        goe goeVarA;
        if (onmVar instanceof q9d) {
            q9dVar = (q9d) onmVar;
            int i = q9dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9dVar.d = i - Integer.MIN_VALUE;
            } else {
                q9dVar = new q9d(this, onmVar);
            }
        } else {
            q9dVar = new q9d(this, onmVar);
        }
        Object objD = q9dVar.b;
        int i2 = q9dVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            AddMembersRequest addMembersRequest = (AddMembersRequest) AddMembersRequest.newBuilder().setAddMembers(AddMembers.newBuilder().setHierarchyId(str).addAllMemberUsername(arrayList)).build();
            q9dVar.a = this;
            q9dVar.d = 1;
            objD = this.a.d(addMembersRequest, q9dVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = q9dVar.a;
            hm5.M(objD);
        }
        sy21 sy21Var = (sy21) objD;
        ddd dddVar = this.b;
        uz1 uz1Var = q9w.e;
        ry21 ry21Var = sy21Var.a;
        if (!ry21Var.Q0) {
            return (ry21Var.d != 403 || (pizVarC = ddd.c(sy21Var)) == null) ? uz1Var : new uz1(pizVarC);
        }
        AddMembersResponse addMembersResponse = (AddMembersResponse) sy21Var.b;
        return (addMembersResponse == null || (goeVarA = bdd.a(dddVar, addMembersResponse.getHierarchy(), null, null, 3)) == null) ? uz1Var : new vz1(goeVarA);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ContributionPayload.Builder e(apl aplVar) throws NoWhenBranchMatchedException {
        RichMedia.Builder builderNewBuilder = RichMedia.newBuilder();
        builderNewBuilder.getClass();
        if (aplVar instanceof wol) {
            builderNewBuilder.setGiphyGif(GiphyGif.newBuilder().setGifId(((wol) aplVar).getId()).setAgeRating(GiphyAgeRating.GIPHY_RATING_G));
        } else if (aplVar instanceof mpl) {
            builderNewBuilder.setSticker(Sticker.newBuilder().setStickerId(((mpl) aplVar).getId()));
        } else {
            if (!(aplVar instanceof ppl)) {
                eg.o();
                return null;
            }
            UGC.Builder builderNewBuilder2 = UGC.newBuilder();
            for (opl oplVar : ((ppl) aplVar).getItems()) {
                int iC = l1d.C(oplVar.a());
                if (iC == 0) {
                    builderNewBuilder2.addImage(Asset.newBuilder().setAssetRef(oplVar.getId()));
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    builderNewBuilder2.addVideo(Asset.newBuilder().setAssetRef(oplVar.getId()));
                }
            }
            builderNewBuilder.setUgc(builderNewBuilder2);
        }
        return ContributionPayload.newBuilder().setRichMedia(builderNewBuilder);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(List list, onm onmVar) {
        r9d r9dVar;
        String uri;
        List hierarchiesList;
        Object next;
        HierarchyIdentifier identifier;
        if (onmVar instanceof r9d) {
            r9dVar = (r9d) onmVar;
            int i = r9dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9dVar.c = i - Integer.MIN_VALUE;
            } else {
                r9dVar = new r9d(this, onmVar);
            }
        } else {
            r9dVar = new r9d(this, onmVar);
        }
        Object objK = r9dVar.a;
        int i2 = r9dVar.c;
        if (i2 == 0) {
            hm5.M(objK);
            CanMessageUsersRequest canMessageUsersRequest = (CanMessageUsersRequest) CanMessageUsersRequest.newBuilder().addAllTargetUsernames(list).setSharedHierarchyTypeFilter(HierarchyType.HIERARCHY_TYPE_DM).build();
            r9dVar.c = 1;
            objK = this.a.k(canMessageUsersRequest, r9dVar);
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
        CanMessageUsersResponse canMessageUsersResponse = (CanMessageUsersResponse) objK;
        Map resultsMap = canMessageUsersResponse.getResultsMap();
        ArrayList arrayList = new ArrayList(resultsMap.size());
        for (Map.Entry entry : resultsMap.entrySet()) {
            String str = (String) entry.getKey();
            Boolean bool = (Boolean) entry.getValue();
            SharedHierarchies sharedHierarchies = (SharedHierarchies) canMessageUsersResponse.getSharedHierarchiesMap().get(str);
            if (sharedHierarchies == null || (hierarchiesList = sharedHierarchies.getHierarchiesList()) == null) {
                uri = null;
            } else {
                Iterator it = hierarchiesList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((SharedHierarchyEntry) next).getType() != HierarchyType.HIERARCHY_TYPE_DM);
                SharedHierarchyEntry sharedHierarchyEntry = (SharedHierarchyEntry) next;
                if (sharedHierarchyEntry == null || (identifier = sharedHierarchyEntry.getIdentifier()) == null) {
                    uri = null;
                } else {
                    uri = identifier.getUri();
                }
            }
            str.getClass();
            bool.getClass();
            arrayList.add(new mfd(str, uri, bool.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.campfire.datasource.impl.ChatFetchException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(int i, String str, onm onmVar) throws NoWhenBranchMatchedException, ChatFetchException {
        s9d s9dVar;
        if (onmVar instanceof s9d) {
            s9dVar = (s9d) onmVar;
            int i2 = s9dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                s9dVar = new s9d(this, onmVar);
            }
        } else {
            s9dVar = new s9d(this, onmVar);
        }
        Object objR = s9dVar.b;
        int i3 = s9dVar.d;
        try {
            if (i3 == 0) {
                hm5.M(objR);
                RetrieveNodeRequest.Builder sortOrder = RetrieveNodeRequest.newBuilder().setHierarchyId(str).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT);
                if (i > 0) {
                    sortOrder.setPrevLimit(i);
                }
                sortOrder.getClass();
                s9dVar.a = str;
                s9dVar.d = 1;
                objR = r(sortOrder, s9dVar);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = s9dVar.a;
                hm5.M(objR);
            }
            return (goe) objR;
        } catch (Exception e) {
            Logger.e(e, l1d.m("Campfire: RetrieveHierarchy response for chat ", str), new Object[0]);
            throw new ChatFetchException(l1d.m("Failed to fetch chat ", str), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.campfire.datasource.impl.ChatFetchException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, onm onmVar) throws NoWhenBranchMatchedException, ChatFetchException {
        t9d t9dVar;
        if (onmVar instanceof t9d) {
            t9dVar = (t9d) onmVar;
            int i = t9dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t9dVar.d = i - Integer.MIN_VALUE;
            } else {
                t9dVar = new t9d(this, onmVar);
            }
        } else {
            t9dVar = new t9d(this, onmVar);
        }
        Object objR = t9dVar.b;
        int i2 = t9dVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objR);
                RetrieveNodeRequest.Builder sortOrder = RetrieveNodeRequest.newBuilder().setNodePathId(str).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT);
                t9dVar.a = str;
                t9dVar.d = 1;
                objR = r(sortOrder, t9dVar);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = t9dVar.a;
                hm5.M(objR);
            }
            return (goe) objR;
        } catch (Exception e) {
            Logger.e(e, l1d.m("Campfire: RetrieveHierarchy response for contribution ", str), new Object[0]);
            throw new ChatFetchException(l1d.m("Failed to fetch chat for contribution ", str), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, Integer num, onm onmVar) throws NoWhenBranchMatchedException {
        u9d u9dVar;
        qte qteVar;
        if (onmVar instanceof u9d) {
            u9dVar = (u9d) onmVar;
            int i = u9dVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                u9dVar.e = i - Integer.MIN_VALUE;
            } else {
                u9dVar = new u9d(this, onmVar);
            }
        } else {
            u9dVar = new u9d(this, onmVar);
        }
        Object objS = u9dVar.c;
        int i2 = u9dVar.e;
        if (i2 == 0) {
            hm5.M(objS);
            RetrieveNodeRequest.Builder sortOrder = RetrieveNodeRequest.newBuilder().setHierarchyId(str).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT);
            if (num != null) {
                sortOrder.setPrevLimit(num.intValue());
            }
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) sortOrder.build();
            u9dVar.a = str;
            u9dVar.b = this;
            u9dVar.e = 1;
            objS = this.a.s(retrieveNodeRequest, u9dVar);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = u9dVar.b;
            str = u9dVar.a;
            hm5.M(objS);
        }
        RetrieveNodeResponse retrieveNodeResponse = (RetrieveNodeResponse) objS;
        goe goeVarE = this.b.e(retrieveNodeResponse);
        if (goeVarE == null) {
            qteVar = null;
        } else {
            List listB = goeVarE.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                if (((tom) obj).b() instanceof lpl) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((tom) it.next());
            }
            qteVar = new qte(goeVarE.getId(), retrieveNodeResponse.getHierarchy().getHierarchyMetadata().getCurrentUserChannelMuted(), goeVarE.j(), goeVarE.h(), goeVarE.g(), arrayList2);
        }
        if (qteVar != null) {
            return qteVar;
        }
        hhg1.o(str, "Invalid chat details for chat ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, String str2, onm onmVar) {
        v9d v9dVar;
        piz pizVarC;
        if (onmVar instanceof v9d) {
            v9dVar = (v9d) onmVar;
            int i = v9dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9dVar.d = i - Integer.MIN_VALUE;
            } else {
                v9dVar = new v9d(this, onmVar);
            }
        } else {
            v9dVar = new v9d(this, onmVar);
        }
        Object objG = v9dVar.b;
        int i2 = v9dVar.d;
        if (i2 == 0) {
            hm5.M(objG);
            ClaimInviteRequest claimInviteRequest = (ClaimInviteRequest) ClaimInviteRequest.newBuilder().setUri(str).setPermissionToken(str2).build();
            v9dVar.a = this;
            v9dVar.d = 1;
            objG = this.a.g(claimInviteRequest, v9dVar);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = v9dVar.a;
            hm5.M(objG);
        }
        sy21 sy21Var = (sy21) objG;
        ddd dddVar = this.b;
        pd90 pd90Var = sl10.t;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.Q0) {
            return qd90.a;
        }
        return (ry21Var.d != 403 || (pizVarC = ddd.c(sy21Var)) == null) ? pd90Var : new pd90(pizVarC);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(String str, e9d[] e9dVarArr, onm onmVar) throws NoWhenBranchMatchedException {
        w9d w9dVar;
        nad nadVar;
        ContributionPayload.Builder builderE;
        if (onmVar instanceof w9d) {
            w9dVar = (w9d) onmVar;
            int i = w9dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w9dVar.d = i - Integer.MIN_VALUE;
            } else {
                w9dVar = new w9d(this, onmVar);
            }
        } else {
            w9dVar = new w9d(this, onmVar);
        }
        w9d w9dVar2 = w9dVar;
        Object objC = w9dVar2.b;
        int i2 = w9dVar2.d;
        if (i2 == 0) {
            hm5.M(objC);
            GroupDetail.Builder builderAddAllMemberUsername = GroupDetail.newBuilder().addAllMemberUsername(f46.G(new String[]{str}));
            ArrayList arrayList = new ArrayList(e9dVarArr.length);
            for (e9d e9dVar : e9dVarArr) {
                if (e9dVar instanceof b9d) {
                    builderE = d((b9d) e9dVar);
                } else if (e9dVar instanceof d9d) {
                    d9d d9dVar = (d9d) e9dVar;
                    builderE = f(d9dVar.b(), d9dVar.d(), d9dVar.a(), null, d9dVar.e());
                } else {
                    if (!(e9dVar instanceof c9d)) {
                        eg.o();
                        return null;
                    }
                    builderE = e(((c9d) e9dVar).a());
                }
                arrayList.add(builderE);
            }
            ContributionPayload.Builder[] builderArr = (ContributionPayload.Builder[]) arrayList.toArray(new ContributionPayload.Builder[0]);
            ContributionPayload.Builder[] builderArr2 = (ContributionPayload.Builder[]) Arrays.copyOf(builderArr, builderArr.length);
            w9dVar2.a = this;
            w9dVar2.d = 1;
            objC = C(false, builderAddAllMemberUsername, null, builderArr2, w9dVar2);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            nadVar = this;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nadVar = w9dVar2.a;
            hm5.M(objC);
        }
        goe goeVarD = nadVar.b.d((ClientNodeResponse) objC);
        if (goeVarD != null) {
            return goeVarD;
        }
        eg.m("Invalid chat after creating DM");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, onm onmVar, boolean z) throws NoWhenBranchMatchedException {
        x9d x9dVar;
        if (onmVar instanceof x9d) {
            x9dVar = (x9d) onmVar;
            int i = x9dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9dVar.d = i - Integer.MIN_VALUE;
            } else {
                x9dVar = new x9d(this, onmVar);
            }
        } else {
            x9dVar = new x9d(this, onmVar);
        }
        Object objD = x9dVar.b;
        int i2 = x9dVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            CreateNew.Builder builderAddMemberUsername = CreateNew.newBuilder().setHierarchyType(HierarchyType.HIERARCHY_TYPE_DM).addMemberUsername(str);
            if (z) {
                builderAddMemberUsername.setFriendRequest(true);
            }
            NodeRequest.Builder[] builderArr = {NodeRequest.newBuilder().setHierarchyRequest(HierarchyRequest.newBuilder().setCreateNew(builderAddMemberUsername))};
            x9dVar.a = this;
            x9dVar.d = 1;
            objD = D(builderArr, false, false, x9dVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = x9dVar.a;
            hm5.M(objD);
        }
        goe goeVarD = this.b.d((ClientNodeResponse) objD);
        if (goeVarD != null) {
            return goeVarD;
        }
        eg.m("Invalid chat after creating DM");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(List list, onm onmVar) {
        y9d y9dVar;
        if (onmVar instanceof y9d) {
            y9dVar = (y9d) onmVar;
            int i = y9dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9dVar.d = i - Integer.MIN_VALUE;
            } else {
                y9dVar = new y9d(this, onmVar);
            }
        } else {
            y9dVar = new y9d(this, onmVar);
        }
        Object objA = y9dVar.b;
        int i2 = y9dVar.d;
        if (i2 == 0) {
            hm5.M(objA);
            CreateGroupRequest createGroupRequest = (CreateGroupRequest) CreateGroupRequest.newBuilder().addAllMemberUsername(list).build();
            y9dVar.a = this;
            y9dVar.d = 1;
            objA = this.a.a(createGroupRequest, y9dVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = y9dVar.a;
            hm5.M(objA);
        }
        goe goeVarA = bdd.a(this, ((CreateGroupResponse) objA).getHierarchy(), z6x.a, null, 2);
        if (goeVarA != null) {
            return goeVarA;
        }
        eg.m("Invalid chat after creating group chat");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(List list, String str, String str2, String str3, e9d[] e9dVarArr, onm onmVar) throws NoWhenBranchMatchedException {
        z9d z9dVar;
        ContributionPayload.Builder builderE;
        if (onmVar instanceof z9d) {
            z9dVar = (z9d) onmVar;
            int i = z9dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9dVar.d = i - Integer.MIN_VALUE;
            } else {
                z9dVar = new z9d(this, onmVar);
            }
        } else {
            z9dVar = new z9d(this, onmVar);
        }
        Object objC = z9dVar.b;
        int i2 = z9dVar.d;
        if (i2 == 0) {
            hm5.M(objC);
            String[] strArr = (String[]) list.toArray(new String[0]);
            GroupDetail.Builder builderAddAllMemberUsername = GroupDetail.newBuilder().addAllMemberUsername(f46.G((String[]) Arrays.copyOf(strArr, strArr.length)));
            if (str != null && !ihc1.y0(str)) {
                builderAddAllMemberUsername.setName(str);
            }
            CreateGroupOptions createGroupOptions = (str2 == null || str3 == null) ? null : (CreateGroupOptions) CreateGroupOptions.newBuilder().setHierarchyId(str2).setRequestToken(str3).build();
            ArrayList arrayList = new ArrayList(e9dVarArr.length);
            for (e9d e9dVar : e9dVarArr) {
                if (e9dVar instanceof b9d) {
                    builderE = d((b9d) e9dVar);
                } else if (e9dVar instanceof d9d) {
                    d9d d9dVar = (d9d) e9dVar;
                    builderE = f(d9dVar.b(), d9dVar.d(), null, null, d9dVar.e());
                } else {
                    if (!(e9dVar instanceof c9d)) {
                        eg.o();
                        return null;
                    }
                    builderE = e(((c9d) e9dVar).a());
                }
                arrayList.add(builderE);
            }
            ContributionPayload.Builder[] builderArr = (ContributionPayload.Builder[]) arrayList.toArray(new ContributionPayload.Builder[0]);
            ContributionPayload.Builder[] builderArr2 = (ContributionPayload.Builder[]) Arrays.copyOf(builderArr, builderArr.length);
            z9dVar.a = this;
            z9dVar.d = 1;
            objC = C(true, builderAddAllMemberUsername, createGroupOptions, builderArr2, z9dVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = z9dVar.a;
            hm5.M(objC);
        }
        goe goeVarD = this.b.d((ClientNodeResponse) objC);
        if (goeVarD != null) {
            return goeVarD;
        }
        eg.m("Invalid chat after creating group chat");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(int i, String str, onm onmVar) {
        aad aadVar;
        if (onmVar instanceof aad) {
            aadVar = (aad) onmVar;
            int i2 = aadVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aadVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aadVar = new aad(this, onmVar);
            }
        } else {
            aadVar = new aad(this, onmVar);
        }
        Object objM = aadVar.a;
        int i3 = aadVar.c;
        if (i3 == 0) {
            hm5.M(objM);
            CreateInviteRequest createInviteRequest = (CreateInviteRequest) CreateInviteRequest.newBuilder().setUri(str).setOptions(InviteOptions.newBuilder().setMaxUsageCount(i).build()).build();
            aadVar.c = 1;
            objM = this.a.m(createInviteRequest, aadVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        return ((CreateInviteResponse) objM).getPermissionToken();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, onm onmVar, boolean z) throws NoWhenBranchMatchedException {
        bad badVar;
        if (onmVar instanceof bad) {
            badVar = (bad) onmVar;
            int i = badVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                badVar.d = i - Integer.MIN_VALUE;
            } else {
                badVar = new bad(this, onmVar);
            }
        } else {
            badVar = new bad(this, onmVar);
        }
        Object objD = badVar.b;
        int i2 = badVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            NodeRequest.Builder[] builderArr = {NodeRequest.newBuilder().setMessageRequest(MessageRequest.newBuilder().setDeleteContribution(DeleteContribution.newBuilder().setNodePathId(str).setDeleteForAll(!z)))};
            badVar.a = this;
            badVar.d = 1;
            objD = D(builderArr, false, false, badVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = badVar.a;
            hm5.M(objD);
        }
        goe goeVarD = this.b.d((ClientNodeResponse) objD);
        if (goeVarD != null) {
            return goeVarD;
        }
        eg.m("Invalid chat after deleting contribution");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(RetrieveNodeRequest.Builder builder, onm onmVar) throws NoWhenBranchMatchedException {
        cad cadVar;
        if (onmVar instanceof cad) {
            cadVar = (cad) onmVar;
            int i = cadVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cadVar.d = i - Integer.MIN_VALUE;
            } else {
                cadVar = new cad(this, onmVar);
            }
        } else {
            cadVar = new cad(this, onmVar);
        }
        Object objO = cadVar.b;
        int i2 = cadVar.d;
        if (i2 == 0) {
            hm5.M(objO);
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) builder.build();
            cadVar.a = this;
            cadVar.d = 1;
            objO = this.a.o(retrieveNodeRequest, cadVar);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = cadVar.a;
            hm5.M(objO);
        }
        goe goeVarE = this.b.e((RetrieveNodeResponse) objO);
        if (goeVarE != null) {
            return goeVarE;
        }
        eg.m("Invalid chat after deleting contribution");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, int i, String str2, List list, cqf cqfVar, onm onmVar) throws NoWhenBranchMatchedException {
        dad dadVar;
        SortOrder sortOrder;
        if (onmVar instanceof dad) {
            dadVar = (dad) onmVar;
            int i2 = dadVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dadVar.c = i2 - Integer.MIN_VALUE;
            } else {
                dadVar = new dad(this, onmVar);
            }
        } else {
            dadVar = new dad(this, onmVar);
        }
        Object objS = dadVar.a;
        int i3 = dadVar.c;
        if (i3 == 0) {
            hm5.M(objS);
            RetrieveNodeRequest.Builder pageSize = RetrieveNodeRequest.newBuilder().setHierarchyId(str).setPageSize(i);
            int iOrdinal = cqfVar.ordinal();
            if (iOrdinal == 0) {
                sortOrder = SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                sortOrder = SortOrder.SORT_ORDER_ASCENDING_OCCURRED_AT;
            }
            RetrieveNodeRequest.Builder sortOrder2 = pageSize.setSortOrder(sortOrder);
            if (str2 != null) {
                sortOrder2.setPageToken(str2);
            }
            sortOrder2.setFilter(RetrieveNodeRequest.Filter.newBuilder().addAllUriKinds(list));
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) sortOrder2.build();
            retrieveNodeRequest.getClass();
            dadVar.c = 1;
            objS = this.a.s(retrieveNodeRequest, dadVar);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objS);
        }
        RetrieveNodeResponse retrieveNodeResponse = (RetrieveNodeResponse) objS;
        List listH = this.b.h(retrieveNodeResponse);
        String nextPageToken = retrieveNodeResponse.getNextPageToken();
        nextPageToken.getClass();
        return new xpf(listH, ihc1.y0(nextPageToken) ? null : nextPageToken);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable t(String str, onm onmVar) {
        ead eadVar;
        sl01 sl01Var;
        if (onmVar instanceof ead) {
            eadVar = (ead) onmVar;
            int i = eadVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eadVar.c = i - Integer.MIN_VALUE;
            } else {
                eadVar = new ead(this, onmVar);
            }
        } else {
            eadVar = new ead(this, onmVar);
        }
        Object objP = eadVar.a;
        int i2 = eadVar.c;
        if (i2 == 0) {
            hm5.M(objP);
            GetHierarchySettingsRequest getHierarchySettingsRequest = (GetHierarchySettingsRequest) GetHierarchySettingsRequest.newBuilder().setHierarchyId(str).build();
            eadVar.c = 1;
            objP = this.a.p(getHierarchySettingsRequest, eadVar);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        List<ReceiptType> disabledReceiptTypesList = ((GetHierarchySettingsResponse) objP).getDisabledReceiptTypesList();
        ArrayList arrayList = new ArrayList();
        for (ReceiptType receiptType : disabledReceiptTypesList) {
            int i3 = receiptType == null ? -1 : p9d.a[receiptType.ordinal()];
            if (i3 == 1) {
                sl01Var = sl01.a;
            } else if (i3 != 2) {
                sl01Var = i3 != 3 ? null : sl01.c;
            } else {
                sl01Var = sl01.b;
            }
            if (sl01Var != null) {
                arrayList.add(sl01Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, onm onmVar) {
        fad fadVar;
        piz pizVarC;
        if (onmVar instanceof fad) {
            fadVar = (fad) onmVar;
            int i = fadVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fadVar.d = i - Integer.MIN_VALUE;
            } else {
                fadVar = new fad(this, onmVar);
            }
        } else {
            fadVar = new fad(this, onmVar);
        }
        Object objQ = fadVar.b;
        int i2 = fadVar.d;
        if (i2 == 0) {
            hm5.M(objQ);
            InviteLinkOpenRequest inviteLinkOpenRequest = (InviteLinkOpenRequest) InviteLinkOpenRequest.newBuilder().setShareId(str).build();
            fadVar.a = this;
            fadVar.d = 1;
            objQ = this.a.q(inviteLinkOpenRequest, fadVar);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = fadVar.a;
            hm5.M(objQ);
        }
        sy21 sy21Var = (sy21) objQ;
        ddd dddVar = this.b;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.Q0) {
            InviteLinkOpenResponse inviteLinkOpenResponse = (InviteLinkOpenResponse) sy21Var.b;
            if (inviteLinkOpenResponse != null && inviteLinkOpenResponse.hasRedirect()) {
                return new vd90(new td90(inviteLinkOpenResponse.getRedirect().getHierarchyId(), inviteLinkOpenResponse.getRedirect().getNodePathId()));
            }
        } else if (ry21Var.d == 403 && (pizVarC = ddd.c(sy21Var)) != null) {
            return new vd90(new sd90(pizVarC));
        }
        return vd90.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(String str, onm onmVar) {
        gad gadVar;
        if (onmVar instanceof gad) {
            gadVar = (gad) onmVar;
            int i = gadVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gadVar.c = i - Integer.MIN_VALUE;
            } else {
                gadVar = new gad(this, onmVar);
            }
        } else {
            gadVar = new gad(this, onmVar);
        }
        Object objP = gadVar.a;
        int i2 = gadVar.c;
        if (i2 == 0) {
            hm5.M(objP);
            GetHierarchySettingsRequest getHierarchySettingsRequest = (GetHierarchySettingsRequest) GetHierarchySettingsRequest.newBuilder().setHierarchyId(str).build();
            gadVar.c = 1;
            objP = this.a.p(getHierarchySettingsRequest, gadVar);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        return yah0.m(((GetHierarchySettingsResponse) objP).getMutedForCurrentUser());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.campfire.datasource.impl.ChatsFetchException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(onm onmVar) throws ChatsFetchException {
        had hadVar;
        goe goeVarA;
        if (onmVar instanceof had) {
            hadVar = (had) onmVar;
            int i = hadVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hadVar.d = i - Integer.MIN_VALUE;
            } else {
                hadVar = new had(this, onmVar);
            }
        } else {
            hadVar = new had(this, onmVar);
        }
        Object objV = hadVar.b;
        int i2 = hadVar.d;
        if (i2 == 0) {
            hm5.M(objV);
            RetrieveLatestNodeRequest retrieveLatestNodeRequest = (RetrieveLatestNodeRequest) RetrieveLatestNodeRequest.newBuilder().setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT).build();
            hadVar.a = this;
            hadVar.d = 1;
            objV = this.a.v(retrieveLatestNodeRequest, hadVar);
            d9n d9nVar = d9n.a;
            if (objV == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = hadVar.a;
            hm5.M(objV);
        }
        sy21 sy21Var = (sy21) objV;
        ddd dddVar = this.b;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.Q0) {
            RetrieveLatestNodeResponse retrieveLatestNodeResponse = (RetrieveLatestNodeResponse) sy21Var.b;
            if (retrieveLatestNodeResponse != null) {
                List<LatestNodeResponse> latestNodeResponseList = retrieveLatestNodeResponse.getLatestNodeResponseList();
                ArrayList arrayList = new ArrayList();
                for (LatestNodeResponse latestNodeResponse : latestNodeResponseList) {
                    latestNodeResponse.getClass();
                    if (latestNodeResponse.hasClientNode()) {
                        MessagePayload.CmpCase cmpCase = latestNodeResponse.getClientNode().getMessagePayload().getCmpCase();
                        goeVarA = (cmpCase == null ? -1 : cdd.a[cmpCase.ordinal()]) == 1 ? bdd.a(dddVar, latestNodeResponse.getHierarchy(), null, dddVar.g(latestNodeResponse.getClientNode()), 1) : bdd.a(dddVar, latestNodeResponse.getHierarchy(), p7h.N(dddVar.f(latestNodeResponse.getClientNode(), latestNodeResponse.getHierarchy().getHierarchyIdentifier().getHierarchyId())), null, 2);
                    } else {
                        goeVarA = bdd.a(dddVar, latestNodeResponse.getHierarchy(), null, null, 3);
                    }
                    if (goeVarA != null) {
                        arrayList.add(goeVarA);
                    }
                }
                return arrayList;
            }
        } else {
            int i3 = ry21Var.d;
            if (400 > i3 || i3 >= 500) {
                throw new ChatsFetchException(f4i1.c(i3, "Failed to fetch chats. Error code: "));
            }
            if (i3 == 403 && u890.j(ddd.c(sy21Var), jiz.a)) {
                throw new ChatsFetchException("Failed to fetch chats. User opted out.");
            }
        }
        return z6x.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable x(int i, String str, String str2, onm onmVar) throws NoWhenBranchMatchedException {
        iad iadVar;
        if (onmVar instanceof iad) {
            iadVar = (iad) onmVar;
            int i2 = iadVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iadVar.e = i2 - Integer.MIN_VALUE;
            } else {
                iadVar = new iad(this, onmVar);
            }
        } else {
            iadVar = new iad(this, onmVar);
        }
        Object objS = iadVar.c;
        int i3 = iadVar.e;
        if (i3 == 0) {
            hm5.M(objS);
            RetrieveNodeRequest retrieveNodeRequest = (RetrieveNodeRequest) RetrieveNodeRequest.newBuilder().setHierarchyId(str).setNodePathId(str2).setSortOrder(SortOrder.SORT_ORDER_DESCENDING_OCCURRED_AT).setPrevLimit(i).build();
            retrieveNodeRequest.getClass();
            iadVar.a = str2;
            iadVar.b = this;
            iadVar.e = 1;
            objS = this.a.s(retrieveNodeRequest, iadVar);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = iadVar.b;
            str2 = iadVar.a;
            hm5.M(objS);
        }
        List listH = this.b.h((RetrieveNodeResponse) objS);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (!u890.j(((tom) obj).getId(), str2)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(String str, onm onmVar) {
        jad jadVar;
        piz pizVarC;
        if (onmVar instanceof jad) {
            jadVar = (jad) onmVar;
            int i = jadVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jadVar.d = i - Integer.MIN_VALUE;
            } else {
                jadVar = new jad(this, onmVar);
            }
        } else {
            jadVar = new jad(this, onmVar);
        }
        Object objN = jadVar.b;
        int i2 = jadVar.d;
        if (i2 == 0) {
            hm5.M(objN);
            OffplatformOpenRequest offplatformOpenRequest = (OffplatformOpenRequest) OffplatformOpenRequest.newBuilder().setOffplatformShareId(str).build();
            jadVar.a = this;
            jadVar.d = 1;
            objN = this.a.n(offplatformOpenRequest, jadVar);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = jadVar.a;
            hm5.M(objN);
        }
        sy21 sy21Var = (sy21) objN;
        ddd dddVar = this.b;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.Q0) {
            OffplatformOpenResponse offplatformOpenResponse = (OffplatformOpenResponse) sy21Var.b;
            if (offplatformOpenResponse != null) {
                return new ymp0(new wmp0(offplatformOpenResponse.getHierarchyId(), offplatformOpenResponse.getRedirectToChat(), offplatformOpenResponse.getNodePathId(), offplatformOpenResponse.getHierarchyExisted()));
            }
        } else if (ry21Var.d == 403 && (pizVarC = ddd.c(sy21Var)) != null) {
            return new ymp0(new vmp0(pizVarC));
        }
        return ymp0.b;
    }

    public final Object z(String str, String str2, onm onmVar) {
        Object objC = this.a.c((RemoveMemberRequest) RemoveMemberRequest.newBuilder().setRemoveMember(RemoveMember.newBuilder().setHierarchyId(str).setMemberUsername(str2)).build(), onmVar);
        return objC == d9n.a ? objC : rih1.a;
    }
}
